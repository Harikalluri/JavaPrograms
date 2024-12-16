package ProgramsRelatedTojava;

class sample1{
	sample1(String str){
		System.out.println("this is sample");
	}
}
class demo extends sample1{
	demo(){
		super("hi");
		System.out.println("this is demo");
	}
}
public class SupercallingStatement {
 public static void main(String[] args) {
	demo d=new demo();
}
}
