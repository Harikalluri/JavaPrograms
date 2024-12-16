package NumberRelatedPrograms;

import java.util.Scanner;

public class HalfPrime {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		boolean flag=true;
		for(int i=2;i<no/2;i++) {
			if(no%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is not a prime");
		}
	}
}
