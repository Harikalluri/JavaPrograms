package ProgramsRelatedTojava;

abstract class sample{
	abstract void sample();
    int a=10;
	
}
class Imple extends sample{
	void sample() {
		System.out.println("Hieee");
	}
}

public class AbstractClass  {

	public static void main(String[] args) {
		Imple i=new Imple();
		i.sample();
		System.out.println(i.a);
	}

	
}
