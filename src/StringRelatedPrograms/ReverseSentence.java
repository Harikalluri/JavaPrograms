package StringRelatedPrograms;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr = str.split(" ");
		String res="";
		for (int i = arr.length-1; i>=0; i--) {
			
				res=res+arr[i]+" ";

		}
		System.out.println(res);
	}
}