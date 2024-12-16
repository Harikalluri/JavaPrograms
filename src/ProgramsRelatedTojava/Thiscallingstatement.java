package ProgramsRelatedTojava;

public class Thiscallingstatement // Constructor overloading
{

	public Thiscallingstatement() {
		this(10);
		System.out.println("Default");
	}

	public Thiscallingstatement(int a) {
		
		this("hi");
		System.out.println("This is int "+a);
	}

	public Thiscallingstatement(String str) {
		System.out.println("this is string "+str);
	}

	public static void main(String[] args) {
		
		Thiscallingstatement t=new Thiscallingstatement();
	}

}
