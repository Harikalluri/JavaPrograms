package StringRelatedPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		if(palindrome(str)) {
			System.out.println("The given string is a palindrome");
		}else {
			System.out.println("The given string is not a palindrome");
		}
		
	}

	 static boolean palindrome(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		
// equals is case sensitive
//		if(res.equals(str)) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		
// equalsIgnoreCase is not case sensitive
		if(res.equalsIgnoreCase(str)) {
			return true;
		}
		else {
			return false;
		}
	}
}
