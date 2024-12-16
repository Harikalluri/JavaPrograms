package ProgramsRelatedTojava;

class solution {

	synchronized public void m11() {
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}

		}
	}

	synchronized public void m22() {
		for (int i = 100; i <111 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}

		}
	}
}

class sample12 extends Thread {
	solution d;

	public sample12(solution s) {
		d = s;
	}

	public void run() {
		d.m11();
	}

}

class sample11 extends Thread {
	solution d;

	public sample11(solution s) {
		d = s;
	}

	public void run() {
		d.m22();
	}

}

public class MultiThreadingProgram {

	public static void main(String[] args) {
		solution S = new solution();
		sample12 s = new sample12(S);
		Thread t1 = new Thread(s);
		t1.start();
		sample11 s1 = new sample11(S);
		Thread t2 = new Thread(s1);
		t2.start();

	}
}
