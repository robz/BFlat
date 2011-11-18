package a.b.c;



import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import a.b.c.BFlatGrammarParser.program_return;

public class GrammarTester {
	public static void main(String[] args) throws RecognitionException {
		BFlatGUI.makeGUI();
	}
	
	public static void runProgram(ProgramInfo pi) throws RecognitionException {
		String programText = pi.programText;
		
		CharStream charStream = new ANTLRStringStream(programText);
		BFlatGrammarLexer lexer = new BFlatGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BFlatGrammarParser parser = new BFlatGrammarParser(tokenStream);
		program_return program = parser.program();
		pi.tree = program.tree.toStringTree();
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.tree);
		EvaluatorWalker walker = new EvaluatorWalker(nodeStream);
		pi.result = walker.evaluator();
	}
	
	static class ProgramInfo
	{
		String programText;
		String tree;
		int result;
		
		public ProgramInfo(String s) {
			programText = s;
		}
		
		public String toString() {
			return "text:\t"+programText+"\ntree:\t"+tree+"\nresult:\t"+result;
		}
	}
}
