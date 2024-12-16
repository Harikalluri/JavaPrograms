package ProgramsRelatedTojava;

class Ding extends Thread{
	synchronized public static void m1() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 Ding1.m2();
	}

	public void run() {
		m1();
	}
}
class Ding1 extends Thread{
	synchronized public static void m2() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Ding.m1();
		
	}

	public void run() {
		m2();
	}
}
public class DeadLock {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Ding());
		t1.start();
		Thread t2=new Thread(new Ding1());
		t2.start();
	}
}
