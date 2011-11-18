package a.b.c;

import java.util.HashSet;
import java.util.StringTokenizer;


public class TreePrinter {
	
//	static class TreeNode{
//		private 
//	}
	
	public static HashSet<String> types;
	static{
		String[] op = {"int", "boolean", "String", "char", "float"};
		types = new HashSet<String>();
		for(int i = 0; i < op.length; i++)
			types.add(op[i]);
	}
	
	public static void main(String[] args){
		String str = "(+ (* 33123 (% 532 22) 23132) (+ 31231 32432) (int a b c)";
		System.out.println(str);
		System.out.println(treePrint(str));
	}

	private static String treePrint(String exp) {
		
		
//		String result = "";
//		int subStringLength = 0;
		
		exp = addPranSpaces(exp);
		

//		for(int i = 0; i < exp.length(); i = i + subStringLength){
//			subStringLength = 0;
//			int pranMatch = 0;
//			for(int j = i; j < exp.length(); j++){
//				char current = exp.charAt(j);
//				if(current == '(')
//					pranMatch++;
//				else if (current == ')')
//					pranMatch--;
//				if(pranMatch != 0 || current != ' ')
//					result += current;
//				subStringLength++;
//				if(pranMatch == 0 && current == ')'){
//					result += '\n';
//					break;
//				}
//			}
//		}
		
//		StringTokenizer toke = new StringTokenizer(exp, " ");
		String[] tokens = exp.split("[\" \"]+");
		String done = "";
		int indentLvl = 0;
		for(int i = 0; i < tokens.length; i++){
			String temp = tokens[i];
			
			if(temp.equals("(")){
				String nextOp = tokens[i+1];
				done += getSpaces(indentLvl) + temp + nextOp + " ";
				if(types.contains(nextOp)){
					String con = tokens[i+2];
					boolean sawClosePran = false;
					int j = 3;
					while(!sawClosePran){
						done += con + " ";
						con = tokens[i+j];
						sawClosePran = con.equals(")");
						indentLvl = indentLvl- (sawClosePran? 1 : 0);
						j++;
						i++;
					}
				}
				else if(Character.isLetterOrDigit(tokens[i + 2].charAt(0)) && (((i+3) < tokens.length) ? Character.isLetterOrDigit(tokens[i+3].charAt(0)) : true)){
					done += tokens[i + 2] + " " + (((i+3) < tokens.length) ? tokens[i+3] : "");
					i = i + ((i+3 < tokens.length) ? 2 : 3);
				}
				else{
					indentLvl++;
					done += "\n";
				}
//				done += getSpaces(indentLvl) + temp  + nextOp + "\n";
				i++;
			}
			else if(temp.equals(")")){
				indentLvl--;
				done += temp + "\n";
			}
			else
				done += (Character.isLetterOrDigit(done.charAt(done.length() - 1)) ? " " : getSpaces(indentLvl) )+ 
						temp + (tokens[i+1].equalsIgnoreCase(")") ? "" : "\n");//(Character.isLetterOrDigit(temp.charAt(0)) ? "\n" : "\n");
		}
//		while(toke.hasMoreTokens()){
//			String temp = toke.nextToken();
//			if(temp.equals("(")){
//				String nextOp = toke.nextToken();
//				done += getSpaces(indentLvl) + temp  + nextOp + "\n";
//				indentLvl++;
//			}
//			else if(temp.equals(")")){
//				indentLvl--;
//				done += temp + "\n";
//			}
//			else
//				done += (Character.isLetterOrDigit(done.charAt(done.length() - 1)) ? " " : getSpaces(indentLvl) )+ temp + (Character.isLetterOrDigit(temp.charAt(0)) ? "" : "\n");
//
//		}

		
		
		return done;
	}
	
//	private static String operatorOffest(String )
	
	private static String getSpaces(int indent){
		String result = "";
//		for(int i = 0; i < num; i++)
//			result += " ";
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
	
//	public static 
	
}
