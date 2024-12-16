package ProgramsRelatedTojava;

class AgeInvalidException extends Exception {
	String msg;

	public AgeInvalidException(String msg) {

		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}

public class CheckedException {
	static void voter() throws AgeInvalidException {
		int age = 13;
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			throw new AgeInvalidException("Invalid age");
		}
	}

	public static void main(String[] args) {
		try {
			voter();
		} catch (AgeInvalidException e) {
			System.out.println(e.getMsg());
		}
	}
}
