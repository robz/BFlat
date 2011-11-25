package a.b.c;

public class Pauser {
	static boolean go, waiting;
	
	public static void waitForGo() {
		go = false;
		waiting = true;
		while(!go) {
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
		waiting = false;
	}
	
	public static boolean isWaiting() {
		return !go && waiting;
	}
	
	public static void go() {
		go = true;
	}
}
