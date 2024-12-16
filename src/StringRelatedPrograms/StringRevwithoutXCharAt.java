package StringRelatedPrograms;

import java.util.Scanner;

public class StringRevwithoutXCharAt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char[] ch=str.toCharArray();
	    String res="";
		for (int i = ch.length-1; i>=0; i--) {
			res+=ch[i];
		}
   System.out.println(res);
	}
}
