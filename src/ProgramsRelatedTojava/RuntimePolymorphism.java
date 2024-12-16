package ProgramsRelatedTojava;

class Animal{
	void noise() {
		System.out.println("This is noise");
	}
}
class Dog extends Animal{
	void noise() {
		System.out.println("This is dog noise");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("This is snake noise");
	}
}
class Cat extends Animal{
	void noise() {
		System.out.println("This is cat noise");
	}
}
class Stimulator{
	void ansim(Animal a) {
		a.noise();
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Dog d=new Dog();
		Snake s=new Snake();
		Cat c=new Cat();
		Stimulator s1=new Stimulator();
		s1.ansim(d);
		s1.ansim(c);
		s1.ansim(s);
	}
}
