package ProgramsRelatedTojava;


class Dosamane{
	void dosa() {
		System.out.println("The tasty dosa");
	}
}
class Swigy extends Dosamane{
	static void order(Dosamane d) {
		d.dosa();
	}
}

public class PassByReference {

	public static void main(String[] args) {
		Dosamane d=new Dosamane();
		Swigy.order(d);
	}
}
