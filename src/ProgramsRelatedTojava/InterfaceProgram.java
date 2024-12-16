package ProgramsRelatedTojava;

interface Anim{
	abstract void noise();
}
class Snak implements Anim{
	public void noise() {
		System.out.println("This is snake noise");
	}
}
class Ca implements Anim{
	public void noise() {
		System.out.println("This is cat noise");
	}
}
class Stimulato{
	static void ansi(Anim a) {
		a.noise();
	}
}

public class InterfaceProgram//Abstraction and interface
{
	public static void main(String[] args) {
		Snak s=new Snak();
		Ca c=new Ca();
	   Stimulato.ansi(s);	
	}
}
