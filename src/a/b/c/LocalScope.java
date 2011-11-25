package a.b.c;

import java.util.HashMap;
import java.util.Map;

public class LocalScope {
	private Map<String, Object> parameters;
	private Map<String, Object> variables;
	private Map<String, FunctInfo> lambdaDefinitions;
	private Map<String, FunctInfo> paramlambdaDefinitions;
	String scopeName;
	private FunctionScopeManager smanager;
	
	public LocalScope(String scopeName, FunctionScopeManager smanager) {
		this.smanager = smanager;
		this.scopeName = scopeName;
		parameters = new HashMap<String, Object> ();
		variables = new HashMap <String, Object> ();
		lambdaDefinitions = new HashMap<String, FunctInfo> ();
		paramlambdaDefinitions = new HashMap<String, FunctInfo> ();
	}
	
	public boolean scopeContains(String var) {
		return parameters.containsKey(var)
				|| variables.containsKey(var)
				|| lambdaDefinitions.containsKey(var)
				|| paramlambdaDefinitions.containsKey(var);
	}
	
	// used when initializing a lambda expression
	public boolean addLambda(String var, Object val) {
		try {
			if (scopeContains(var))
				throw new Exception("dec; already declared variable "+var);
			lambdaDefinitions.put(var, (FunctInfo)val); 
			smanager.add(var);
		    BFlatGUI.debugPrint(1, var+" is initially "+val);
		} catch(Exception ex) {
			BFlatGUI.debugPrint(0, ex.getMessage());
			return false;
		}
		return true;
	}
	
	// used when adding lambda params to the localscope
	public boolean addLambdaParam(String var, FunctInfo fi) {
		try {
			if (scopeContains(var))
				throw new Exception("dec; already declared variable "+var);
			paramlambdaDefinitions.put(var, (FunctInfo)fi); 
		    BFlatGUI.debugPrint(1, var+" is initially "+fi);
		} catch(Exception ex) {
			BFlatGUI.debugPrint(0, ex.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean addParam(String var, Object val) {
		try {
			if (scopeContains(var))
				throw new Exception("dec; already declared variable "+var);
	        parameters.put(var, val); 
		    BFlatGUI.debugPrint(1, var+" is initially "+val);
		} catch(Exception ex) {
			BFlatGUI.debugPrint(0, ex.getMessage());
			return false;
		}
		return true;
	}
	
	// returns false if the variable was already in the hashmap
	// ALSO: this prints debug information
	public boolean addVar(String var, Object val) {
		try {
			if (scopeContains(var))
				throw new Exception("dec; already declared variable "+var);
	        variables.put(var, val); 
			smanager.add(var);
		    BFlatGUI.debugPrint(1, var+" is initially "+val);
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
		    if (!scopeContains(var))
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
		if (variables.containsKey(var)) {
			return variables.get(var);
		} else if (lambdaDefinitions.containsKey(var)) {
			return lambdaDefinitions.get(var);
		} else if (paramlambdaDefinitions.containsKey(var)) {
			return paramlambdaDefinitions.get(var);
		} else if (parameters.containsKey(var)) {
			return parameters.get(var);
		}
		return null;
	}
	
	// used in the functionfinder
	public FunctInfo getLambda(String var) {
		if (lambdaDefinitions.containsKey(var)) {
			return lambdaDefinitions.get(var);
		} else if (paramlambdaDefinitions.containsKey(var)) {
			return paramlambdaDefinitions.get(var);
		} 
		return null;
	}
	
	// used in function scope manager
	public Object removeVar(String var) {
		if (lambdaDefinitions.containsKey(var)) {
			return lambdaDefinitions.remove(var);
		} else if (variables.containsKey(var)) {
			return variables.remove(var);
		}
		return false;
	}
	
	public String toString() {
		String str = "** "+scopeName+" **";
		
		if (parameters.size() > 0 || paramlambdaDefinitions.size() > 0)
			str += "\n--parameters--";
		for(String var : paramlambdaDefinitions.keySet()) 
			str += "\n"+var+"\t"+paramlambdaDefinitions.get(var);
		for(String var : parameters.keySet()) 
			str += "\n"+var+"\t"+parameters.get(var);
		
		if (variables.size() > 0 || lambdaDefinitions.size() > 0)
			str += "\n--variables--";
		for(String var : lambdaDefinitions.keySet()) 
			str += "\n"+var+"\t"+lambdaDefinitions.get(var);
		for(String var : variables.keySet()) 
			str += "\n"+var+"\t"+variables.get(var);
		return str;
	}
}
