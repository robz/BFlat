package a.b.c;

import org.antlr.runtime.tree.CommonTree;

class FunctInfo
{
  CommonTree body;
  String paramList;
  String typeList;
  String toString;
  
  public FunctInfo(CommonTree b, String p, String t) {
    body = b;
    paramList = p;
    typeList = t;
    
    String[] s1 = t.split(";"),
    		s2 = p.split(";");
    toString = "function";
    for(int i = 0; i < s1.length; i++) {
    	toString += "  ("+s1[i]+" "+s2[i]+")";
    }
  }
  
  public String toString() {
	  return toString;
  }
}
