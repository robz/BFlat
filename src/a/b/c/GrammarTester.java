package a.b.c;



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
	
	public static void main(String[] args) throws RecognitionException {
		//BFlatGUI.makeGUI();
		ProgramInfo[] testCases = new ProgramInfo[]{
				new ProgramInfo("int x; x = 3;", "(int x) (= x 3)"),
				new ProgramInfo("int x; x = 3;", "(int x) (= x 3)")};
		
		for(ProgramInfo testCase:testCases) {
			ProgramInfo runCase = new ProgramInfo(testCase.programText);
			parseProgram(runCase);
			System.out.println("TestCase: \n"+testCase.toString()+"\nRunCase: \n"+runCase.toString());
			boolean isGood = testCase.treeText.equals(runCase.treeText);
			System.out.println("Test cases equal? "+isGood);
		}
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
			    BFlatGUI.debugPrint(1, var+" : "+val);
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
}
