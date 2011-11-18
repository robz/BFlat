package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import a.b.c.BFlatGrammarParser.program_return;

public class GrammarTester {
	static Scope scope = new Scope();
	
	public static void main(String[] args) throws RecognitionException {
		BFlatGUI.makeGUI();
		//runTestCases(false);
	}
	
	public static void parseProgram(ProgramInfo pi) throws RecognitionException {
		String programText = pi.programText;
		
		CharStream charStream = new ANTLRStringStream(programText);
		BFlatGrammarLexer lexer = new BFlatGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BFlatGrammarParser parser = new BFlatGrammarParser(tokenStream);
		program_return program = parser.program();
		pi.treeObject = program.tree;
		pi.treeText = program.tree.toStringTree();
	}

	public static void runProgram(ProgramInfo pi) throws RecognitionException {
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(pi.treeObject);
		EvaluatorWalker walker = new EvaluatorWalker(nodeStream);
		pi.result = walker.evaluator();
	}
	
	static class Scope
	{
		private Map<String, Object> variables = new HashMap <String, Object> ();
		
		// returns false if the variable was already in the hashmap
		// ALSO: this prints debug information
		public boolean add(String var, Object val) {
			try {
				if (variables.containsKey(var))
					throw new Exception("dec; already declared variable "+var);
		        variables.put(var, val); 
			    BFlatGUI.debugPrint(1, var+" is now "+val);
			} catch(Exception ex) {
				BFlatGUI.debugPrint(0, ex.getMessage());
				return false;
			}
			return true;
		}
		
		// returns false if the variable is not in the hashmap
		// (or false if the type of the val isn't the same as the type of the hashmap's current?)
		// ALSO: this prints debug information
		public boolean set(String var, Object val) {
		    try {
			    if (!variables.containsKey(var))
			    	throw new Exception("undeclared variable "+var);
			    String varclass = variables.get(var).getClass().getName(),
			    		expclass = val.getClass().getName();
			    if (!varclass.equals(expclass))
			    	throw new Exception("unexpected type: "+var+" is "+varclass+" but was expecting "+expclass);
			    variables.put(var, val); 
			    BFlatGUI.debugPrint(1, var+" is now "+val);
		    } catch(Exception ex) {
		    	BFlatGUI.debugPrint(0, "assignment; "+ex.getMessage());
		    	return false;
		    }
		    return true;
		}
		
		// returns the value of the var
		//	null if the variable isn't in the hashmap
		// ALSO: this prints debug information
		public Object get(String var) {
			Object result = variables.get(var); 
			return result;
		}
		
		public String toString() {
			String str = "\n\n\n~Current Program Scope~\n\n";
			for(String var : variables.keySet()) 
				str += var+"\t"+variables.get(var)+"\n";
			return str;
		}
	}
	
	static class ProgramInfo 
	{
		String programText;
		String treeText;
		Object treeObject;
		Scope s;
		int result;
		
		public ProgramInfo(String s) {
			programText = s;
		}
		
		public ProgramInfo(String ptext, String ttext) {
			programText = ptext;
			treeText = ttext;
		}
		
		public String toString() {
			return "text:\t"+programText+"\ntree:\t"+treeText+"\nresult:\t"+result;
		}

		public boolean parseEquals(ProgramInfo arg0) {
			return (programText.equals(arg0.programText))
					&& (treeText.equals(arg0.treeText));
		}
	}

	public static void runTestCases(boolean verbose) throws RecognitionException
	{
		ProgramInfo[] testCases = new ProgramInfo[] {
				new ProgramInfo("int x; x = 3;",
								"(int x) (= x 3)"),
								
				new ProgramInfo("int x; x = -x;", 
								"(int x) (= x (ARITH_NEGATION x))"),	
								
				new ProgramInfo("int y; y = 5;",
								"(int y) (= y 5)"),
								
				new ProgramInfo("int x; x = 3; x = x + x;",
								"(int x) (= x 3) (= x (+ x x))"),
								
				new ProgramInfo("int x; int y; x = 3; y = 2; x = x + x; y = x % y;", 
								"(int x) (int y) (= x 3) (= y 2) (= x (+ x x)) (= y (% x y))"),
								
				new ProgramInfo("boolean x; x = false;", 
								"(boolean x) (= x false)"),
				
				new ProgramInfo("boolean x; boolean y; x = false; y = true; x = x && y;", 
								"(boolean x) (boolean y) (= x false) (= y true) (= x (&& x y))"),
				
				new ProgramInfo("int x; boolean y; x = 1; y = true; y = x > x || x > x - 1;", 
								"(int x) (boolean y) (= x 1) (= y true) (= y (|| (> x x) (> x (- x 1))))"),
								
				new ProgramInfo("boolean x; boolean y; x = false; y = false; x = x || y && y || x;", 
								"(boolean x) (boolean y) (= x false) (= y false) (= x (|| (|| x (&& y y)) x))"),
				
				new ProgramInfo("int x; boolean y; x = 7; y = x == 7 && x != 6;", 
								"(int x) (boolean y) (= x 7) (= y (&& (== x 7) (!= x 6)))"),
								
				new ProgramInfo("int x,y,z;\n" + 
								"boolean f,g;\n" + 
								"x = 5+4-3*2/1%6;\n" + 
								"y = x+4-x*2/1%x;\n" + 
								"z = x+y-x*y/y%x;\n" + 
								"f = (x==y) && !(x!=y) || (x>=z) && (x>z) || !(y<=z) && (y<z);\n" + 
								"g = false || true && !true;\n" + 
								"if(g){x = 3;}", 
								"(int x y z) (boolean f g) (= x (- (+ 5 4) (% (/ (* 3 2) 1) 6))) (= y (- (+ x 4) (% (/ (* x 2) 1) x))) (= z (- (+ x y) (% (/ (* x y) y) x))) (= f (|| (|| (&& (== x y) (BOOL_NEGATION (!= x y))) (&& (>= x z) (> x z))) (&& (BOOL_NEGATION (<= y z)) (< y z)))) (= g (|| false (&& true (BOOL_NEGATION true)))) (if g (= x 3))")
		};
		
		int index = 0;
		ArrayList<Integer> failedCases = new ArrayList<Integer>();
		for(ProgramInfo testCase:testCases)
		{
			ProgramInfo runCase = new ProgramInfo(testCase.programText);
			parseProgram(runCase);
			
			System.out.println("\n" + index + ".");
			if(verbose)
				System.out.println("TestCase: "+ testCase.toString() + "\nRunCase: " +runCase.toString());
			
			boolean isGood = testCase.treeText.equals(runCase.treeText);
			System.out.println("Test cases equal? "+isGood);
			
			if(!isGood)
				failedCases.add(index);
			
			index++;
		}
		
		System.out.println("\nIndices of failed cases: "+failedCases);
		System.out.println(testCases.length - failedCases.size() + "/" + testCases.length + " correct.");
	}
}
