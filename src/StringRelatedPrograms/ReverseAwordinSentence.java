package StringRelatedPrograms;

import java.util.Scanner;

class Reverse {

	String rev(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res+=str.charAt(i);
		}
	return res+" ";
	}
}

public class ReverseAwordinSentence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Reverse reverse = new Reverse();
		String str = scanner.nextLine();
		String res="";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			res+=reverse.rev(arr[i]);
		}
		System.out.print(res);

	}
}
