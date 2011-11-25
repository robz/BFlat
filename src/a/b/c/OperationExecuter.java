package a.b.c;

public class OperationExecuter {
	LocalScope scope;
	Object op1, op2;
	String operation;
	String value;
	
	public OperationExecuter(Object op1, Object op2, String operation) {
		this.op1 = op1;
		this.op2 = op2;
		this.operation = operation;
	}
	
	public OperationExecuter(LocalScope scope, String value, String operation) {
		this.scope = scope;
		this.value = value;
		this.operation = operation;
	}
	
	public Object doOperation() {
		Object result = null;
		//System.out.print("("+operation+" "+op1+" "+op2+" "+value+") ->");
		try {
			if (operation.equals("+")) { result = (Integer)op1 + (Integer)op2; }
			else if (operation.equals("-")) { result = (Integer)op1 - (Integer)op2; }
			else if (operation.equals("*")) { result = (Integer)op1 * (Integer)op2; }
			else if (operation.equals("/")) { result = (Integer)op1 / (Integer)op2; }
			else if (operation.equals("%")) { result = (Integer)op1 % (Integer)op2; }
			else if (operation.equals("ARITH_NEGATION")) { result = -(Integer)op1; }
			else if (operation.equals("||")) { result = ((Boolean)op1 || (Boolean)op2); }
			else if (operation.equals("&&")) { result = ((Boolean)op1 && (Boolean)op2); }
			else if (operation.equals("==")) { result = op1.equals(op2); if (!op1.getClass().equals(op2.getClass())) throw new Exception("operands not equal type!");}
			else if (operation.equals("!=")) { result = !op1.equals(op2); }
			else if (operation.equals(">=")) { result = ((Integer)op1 >= (Integer)op2); }
			else if (operation.equals("<=")) { result = ((Integer)op1 <= (Integer)op2); }
			else if (operation.equals(">")) { result = ((Integer)op1 > (Integer)op2); }
			else if (operation.equals("<")) { result = ((Integer)op1 < (Integer)op2); }
			else if (operation.equals("BOOL_NEGATION")) { result = !(Boolean)op1; }
			else if (operation.equals("INTEGER")) { result = Integer.parseInt(value); } 
			else if (operation.equals("BOOL")) { result = Boolean.parseBoolean(value); } 
			else if (operation.equals("IDENT")) { result = scope.get(value); }
		} catch(Exception ex) {
			BFlatGUI.debugPrint(0, "operation; "+ex.getStackTrace());
		}

		//System.out.println(result);
		return result;
	}
}
