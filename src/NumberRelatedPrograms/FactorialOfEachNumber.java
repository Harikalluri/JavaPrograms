package NumberRelatedPrograms;

import java.util.Scanner;

public class FactorialOfEachNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		while(no!=0) {
			int rem=no%10;
			fact(rem);
			no=no/10;
		}
	}

	 static void fact(int rem) {
		int mul=1;
		for(int i=rem;i>=1;i--) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
