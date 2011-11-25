package a.b.c;

import a.b.c.GrammarTester.ProgramInfo;

public class RunTester {

	
	static ProgramInfo[] testCases = new ProgramInfo[]
			{
				new ProgramInfo("function main(){int x; x = 3;}",
						"(FUNC main (BLOCK (int x) (= x 3)))"),

		new ProgramInfo("function main(){int x; x = -x;}", 
						"(FUNC main (BLOCK (int x) (= x (ARITH_NEGATION x))))"),

		new ProgramInfo("function main(){int y; y = 5;}",
						"(FUNC main (BLOCK (int y) (= y 5)))"),

		new ProgramInfo("function main(){int x; x = 3; x = x + x;}",
						"(FUNC main (BLOCK (int x) (= x 3) (= x (+ x x))))"),

		new ProgramInfo("function main(){int x; int y; x = 3; y = 2; x = x + x; y = x % y;}", 
						"(FUNC main (BLOCK (int x) (int y) (= x 3) (= y 2) (= x (+ x x)) (= y (% x y))))"),

		new ProgramInfo("function main(){boolean x; x = false;}", 
						"(FUNC main (BLOCK (boolean x) (= x false)))"),

		new ProgramInfo("function main(){boolean x; boolean y; x = false; y = true; x = x && y;}", 
						"(FUNC main (BLOCK (boolean x) (boolean y) (= x false) (= y true) (= x (&& x y))))"),

		new ProgramInfo("function main(){int x; boolean y; x = 1; y = true; y = x > x || x > x - 1;}", 
						"(FUNC main (BLOCK (int x) (boolean y) (= x 1) (= y true) (= y (|| (> x x) (> x (- x 1))))))"),

		new ProgramInfo("function main(){boolean x; boolean y; x = false; y = false; x = x || y && y || x;}", 
						"(FUNC main (BLOCK (boolean x) (boolean y) (= x false) (= y false) (= x (|| (|| x (&& y y)) x))))"),

		new ProgramInfo("function main(){int x; boolean y; x = 7; y = x == 7 && x != 6;}", 
						"(FUNC main (BLOCK (int x) (boolean y) (= x 7) (= y (&& (== x 7) (!= x 6)))))"),

		new ProgramInfo("function main(){int x,y,z;\n" +
		"boolean f,g;\n" +
		"x = 5+4-3*2/1%6;\n" +
		"y = x+4-x*2/1%x;\n" +
		"z = x+y-x*y/y%x;\n" +
		"f = (x==y) && !(x!=y) || (x>=z) && (x>z) || !(y<=z) && (y<z);\n" +
		"g = false || true && !true;\n" +
		"if(g){x = 3;}}",

		"(FUNC main (BLOCK (int x y z) (boolean f g) (= x (- (+ 5 4) (% (/ (* 3 2) 1) 6))) (= y (- (+ x 4) (% (/ (* x 2) 1) x))) (= z (- (+ x y) (% (/ (* x y) y) x))) (= f (|| (|| (&& (== x y) (BOOL_NEGATION (!= x y))) (&& (>= x z) (> x z))) (&& (BOOL_NEGATION (<= y z)) (< y z)))) (= g (|| false (&& true (BOOL_NEGATION true)))) (if g (= x 3))))"),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	int x;\n" +
		"	x = 3;\n" +
		"}",
		"(FUNC main (BLOCK (int x) (= x 3)))"
		),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	int number;\n" +
		"	boolean trueValue;\n" +
		"	number = 7;\n" +
		"	trueValue = true;\n" +
		"	trueValue = !trueValue;\n" +
		"}",
		"(FUNC main (BLOCK (int number) (boolean trueValue) (= number 7) (= trueValue true) (= trueValue (BOOL_NEGATION trueValue))))"
		),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	int n1,n2,n3;\n" +
		"	boolean t,f;\n" +
		"	n1=1;n2=2;n3=3;\n" +
		"	t = true;f=false;\n" +
		"}",
		"(FUNC main (BLOCK (int n1 n2 n3) (boolean t f) (= n1 1) (= n2 2) (= n3 3) (= t true) (= f false)))"
		),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	int n1;\n" +
		"}\n"+
		"function notMain()\n" +
		"{\n" +
		"	int n2;\n" +
		"}\n",
		"(FUNC main (BLOCK (int n1))) (FUNC notMain (BLOCK (int n2)))"
		),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	int n1;\n" +
		"	boolean madeIt;\n" +
		"	notMain();\n" +
		"	madeIt = true;\n" +
		"}\n"+

		"function notMain()\n" +
		"{\n" +
		"	int n2;\n" +
		"	notMainEither();\n" +
		"}\n"+

		"function notMainEither()\n" +
		"{\n" +
		"	int n3;\n" +
		"}\n",
		"(FUNC main (BLOCK (int n1) (boolean madeIt) (CALL notMain) (= madeIt true))) (FUNC notMain (BLOCK (int n2) (CALL notMainEither))) (FUNC notMainEither (BLOCK (int n3)))"
		),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	notMainEither();\n" +
		"}\n" +
		"function notMain()\n" +
		"{\n" +
		"	boolean shouldNotBeSet;\n" +
		" 	shouldNotBeSet = true;\n"+
		"	notMainEither();\n" +
		"}\n" +
		"function notMainEither()\n" +
		"{\n" +
		"	int n3;\n" +
		"}\n",

		"(FUNC main (BLOCK (CALL notMainEither))) (FUNC notMain (BLOCK (boolean shouldNotBeSet) (= shouldNotBeSet true) (CALL notMainEither))) (FUNC notMainEither (BLOCK (int n3)))"
		),

		new ProgramInfo
		(
		"function main() \n" +
		"{\n" +
		"	int x;\n" +
		"	boolean flag;\n" +
		"	x = 0;\n" +
		"	flag = x == zero() + 1;\n" +
		"}\n" +

		"function add5()\n" +
		"{\n" +
		"	int adderand;\n" +
		"	adderand = 5;\n" +
		"}\n" +

		"function sub5()\n" +
		"{\n" +
		"	int subberand;\n" +
		"	subberand = -5;\n" +
		"}\n" +
		"\n" +
		"function zero()\n" +
		"{\n" +
		"	int z;\n" +
		"	z = add5() + sub5();\n" +
		"}\n",
		"(FUNC main (BLOCK (int x) (boolean flag) (= x 0) (= flag (== x (+ (CALL zero) 1))))) (FUNC add5 (BLOCK (int adderand) (= adderand 5))) (FUNC sub5 (BLOCK (int subberand) (= subberand (ARITH_NEGATION 5)))) (FUNC zero (BLOCK (int z) (= z (+ (CALL add5) (CALL sub5)))))"),

		new ProgramInfo
		(
		"function main()\n" +
		"{\n" +
		"	//this is a comment\n" +
		"	int x;\n" +
		"	//I hope this doesn't screw up\n" +
		"	x = /*cause that'd suck */ 1;\n" +
		"}\n",
		"(FUNC main (BLOCK (int x) (= x 1)))")
			};
	
/*
	static ProgramInfo[] testCases = new ProgramInfo[]{
		new ProgramInfo("function main(){int x; x = 3;}","","Entering main function! x is initially 0 x is now 3 Leaving main function! Program result: 3 "),
		new ProgramInfo("function main(){int x; x = -x;}","","Entering main function! x is initially 0 x is now 0 Leaving main function! Program result: 0 "),
		new ProgramInfo("function main(){int y; y = 5;}","","Entering main function! y is initially 0 y is now 5 Leaving main function! Program result: 5 ")};
*/
}
