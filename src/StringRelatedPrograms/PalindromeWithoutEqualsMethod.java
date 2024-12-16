package StringRelatedPrograms;

import java.util.Scanner;

public class PalindromeWithoutEqualsMethod {

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
		int si=0;
		int ei=str.length()-1;
		str=str.toLowerCase();
		while(si<ei) {
			if(str.charAt(si)!=str.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
		
	}
}
