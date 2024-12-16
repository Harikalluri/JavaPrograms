package NumberRelatedPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int copy=no;
		int res=0;
		while(no!=0) {
			int rem=no%10;
			res=(res*10)+rem;
			no=no/10;
		}
		if(copy==res) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
		
	}
}
