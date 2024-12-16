package ProgramsRelatedTojava;

class Bank{
	private int id=1234;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.getId());
		b.setId(2233);
		System.out.println(b.getId());
	}
}
