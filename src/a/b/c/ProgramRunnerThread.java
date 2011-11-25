package a.b.c;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import a.b.c.GrammarTester.ProgramInfo;

class ProgramRunnerThread extends Thread
{
	String programText;
	
	public ProgramRunnerThread(String s) {
		programText = s;
	}
	
	public void run() {
		try { 
			executeProgram();
		} catch (Exception ex) {
			BFlatGUI.debugPrint(0, "failed during execution:"+ex.getMessage());
			System.out.println(EvaluatorWalker.scopeStack.isEmpty());
		}
	}

	private void executeProgram() throws RecognitionException, IOException {
		ProgramInfo info = new ProgramInfo(programText);
		GrammarTester.parseProgram(info);
		
		if (!info.parseError) {
			BFlatGUI.setProgTree(TreePrinter.treePrint(info.treeText));
			GrammarTester.runProgram(info, true); 
			BFlatGUI.debugPrint(4, "Program result: "+info.result.toString());
		} else {
			String[] s = info.parseErrorMsg.split("\n");
			for(String msg:s)
				BFlatGUI.debugPrint(0, msg);
		}
	}
}
