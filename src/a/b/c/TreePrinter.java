package a.b.c;

import java.util.HashSet;

public class TreePrinter {
	
	public static HashSet<String> types;
	static{
		String[] op = {"int", "boolean", "String", "char", "float", "ARITH_NEGATION" , "BOOL_NEGATION", "ARG", "PARAM"};
		types = new HashSet<String>();
		for(int i = 0; i < op.length; i++)
			types.add(op[i]);
	}
	
//	public static void main(String[] args){
//		String str = "(FUNC main (PARAM x) (PARAM y) (BLOCK (int x) (CALL main (CALL main (ARG (+ (* (CALL a b) y) x)) (ARG y)))))";
//		System.out.println(str);
//		System.out.println(treePrint(str));
//	}

	public static String treePrint(String exp) {

		exp = addPranSpaces(exp);
		
		String[] tokens = exp.split("[\" \"]+");
		String done = "";
		int indentLvl = 0;
		boolean flag = false;
		for(int i = 0; i < tokens.length; i++){
			String temp = tokens[i];
			if(temp.equals("(")){
				String nextOp = tokens[i+1];
				done += (flag ? " " : getSpaces(indentLvl)) + temp + nextOp;
				if(types.contains(nextOp)){
					String con = tokens[i+2];
					boolean sawClosePran = false;
					int j = 3;
					flag = false;
					while(!sawClosePran ){
						if((nextOp.equals("BOOL_NEGATION") || nextOp.equals("ARITH_NEGATION")) && !Character.isLetterOrDigit(con.charAt(0))){
							int parMatch = 1;
							while(parMatch != 0){
								done += " " + con;
								con = tokens[i+j];
								parMatch -= con.equals(")") ? 1 : 0;
								parMatch += con.equals("(") ? 1 : 0;
								j++;
							}
							done += ")";
							i++;
							sawClosePran = true;
							break;
						}
						else{
							if(nextOp.equals("ARG")){
								if(con.equals("(")){
									indentLvl++;
									i--;
									break;
								}
								else{
									done += " " + con;
									con = tokens[i+j];
									sawClosePran = con.equals(")");
									done += sawClosePran ? ")" : "";
									j++;
							
								}
							}
							else{
								done += " " + con;
								con = tokens[i+j];
								sawClosePran = con.equals(")");
								j++;
							}
						}
					}
					i = i + j - 2;
					done += (nextOp.equals("ARG") ? "\n" : ")\n");
					//}
					
				}
				else if(Character.isLetterOrDigit(tokens[i + 2].charAt(0)) && (((i+3) < tokens.length) ? Character.isLetterOrDigit(tokens[i+3].charAt(0)) : true)){
						done += " " + tokens[i + 2] + " " + (((i+3) < tokens.length) ? tokens[i+3] : "");
						done += ")\n";
						i++;
						i = i + ((i+3 < tokens.length) ? 2 : 3);
				}
				else{
					if(nextOp.equals("FUNC")){
						done += " " + tokens[i+2];
						i++;
					}
					else if(nextOp.equals("CALL")){
						done += " " + (tokens[i+3].equals("(") ? tokens[i+2] : tokens[i+2] + tokens[i+3]);
						i += (tokens[i+3].equals("(") ? 1 : 2); 
//						i++;
					}
					indentLvl++;
					done += "\n";
				}
				i++;
			}
			else if(temp.equals(")")){
				indentLvl--;
				done += (done.charAt(done.length() - 1) == '\n' ? "" : "\n") + getSpaces(indentLvl) + temp + "\n";
			}
			else
				done += (Character.isLetterOrDigit(done.charAt(done.length() - 1)) ? " " : getSpaces(indentLvl) )+ 
						temp + (tokens[i+1].equalsIgnoreCase(")") ? "" : "\n");
		}
		
		return done;
	}
	
	
	private static String getSpaces(int indent){
		String result = "";
		for(int i = 0; i < indent; i++)
			result +=  "    ";
		return result;
	}

	private static String addPranSpaces(String exp) {
		String result = "";
		for(int i =0;i < exp.length() ; i++){
			char c;
			if((c = exp.charAt(i))=='(')
				result = result + c + " ";
			else if(exp.charAt(i) == ')')
				result = result + " " + c + " "; 
			else
				result = result + c;
		}
		
		return result;
	}
}