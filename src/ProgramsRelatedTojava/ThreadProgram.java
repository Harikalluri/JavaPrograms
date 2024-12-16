package ProgramsRelatedTojava;

public class ThreadProgram extends Thread{
	public void run() {
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
			
		}
	}

	public static void main(String[] args) {
		ThreadProgram t=new ThreadProgram();
		Thread th=new Thread(t);
		th.start();
	}
}
