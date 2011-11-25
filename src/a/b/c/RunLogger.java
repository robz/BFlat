package a.b.c;

public class RunLogger {
	static String lines;
	static boolean actuallyDoIt = false;
	
	static void record(String line) {
		if (actuallyDoIt)
			lines += line+" ";
	}
}
