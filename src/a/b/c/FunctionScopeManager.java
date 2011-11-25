package a.b.c;

import java.util.ArrayList;
import java.util.Stack;

public class FunctionScopeManager {
	private Stack<ArrayList<String>> scopeStack;
	
	public  FunctionScopeManager(){
		scopeStack = new Stack<ArrayList<String>>();
	}
	
	public void add(String varname){
		this.scopeStack.peek().add(varname);
	}
	
	public void pushScope(){
		scopeStack.push(new ArrayList<String>());
	}
	
	public void popScope(LocalScope scope){
		ArrayList<String> currentScope = scopeStack.pop();
		for(int i = 0; i < currentScope.size(); i++){
			scope.removeVar(currentScope.get(i));
		}
	}
	
	public String toString() {
		String str = "Internal Fuction Scope:";
		for(int i = 0; i < scopeStack.size(); i++) {
			str += "\n--------\n";
			ArrayList<String> tempScope = scopeStack.get(i);
			String list = "[", prefix = "";
			for(int j = 0; j < tempScope.size(); j++) {
				list += prefix+tempScope.get(j);
				prefix = ", ";
			}
			str += list+"]";
		}
		return str;
	}
}