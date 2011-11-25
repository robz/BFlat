package a.b.c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.BufferedTreeNodeStream;

import a.b.c.BFlatGrammarParser.program_return;

public class GrammarTester {
	
	public static void main(String[] args) throws RecognitionException, IOException {
		BFlatGUI.makeGUI();
		//outputTesting.runTestCases(false, false);
	}
	
	public static void parseProgram(ProgramInfo pi) throws RecognitionException, IOException {
		String programText = pi.programText;
		
		CharStream charStream = new ANTLRStringStream(programText);
		BFlatGrammarLexer lexer = new BFlatGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BFlatGrammarParser parser = new BFlatGrammarParser(tokenStream);
		
		FileOutputStream out = new FileOutputStream("errlog");
		System.setErr(new PrintStream(out));
		program_return program = parser.program();
		out.close();
		
		pi.parseErrorMsg = "";
		Scanner sc = new Scanner(new File("errlog"));
		while(sc.hasNext()) pi.parseErrorMsg += sc.nextLine()+"\n";
		pi.parseError = (!pi.parseErrorMsg.equals(""));
		
		System.setErr(System.out);
		
		pi.treeObject = program.tree;
		pi.treeText = program.tree.toStringTree();
		pi.functionDefinitions = parser.getFunctionDefinitions();
	}

	public static void runProgram(ProgramInfo pi, boolean stepping) throws RecognitionException {
		BufferedTreeNodeStream nodes = new BufferedTreeNodeStream(pi.treeObject);
		EvaluatorWalker walker = new EvaluatorWalker(nodes, pi.functionDefinitions, stepping);
		pi.result = walker.evaluator();
	}
	
	static class ProgramInfo 
	{
		String programText;
		String treeText;
		String runText;
		Object treeObject;
		Map<String, FunctInfo> functionDefinitions;
		Object result;
		
		String parseErrorMsg;
		boolean parseError;
		
		public ProgramInfo(String s) {
			programText = s;
		}
		
		public ProgramInfo(String ptext, String ttext) {
			programText = ptext;
			treeText = ttext;
		}
		
		public ProgramInfo(String ptext, String ttext, String rtext) {
			programText = ptext;
			treeText = ttext;
			runText = rtext;
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
