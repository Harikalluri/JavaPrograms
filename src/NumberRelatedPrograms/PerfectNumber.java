package NumberRelatedPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=no/2;i++) {
			if(no%i==0) {
				sum+=i;
			}
		}
		if(no==sum) {
			System.out.println("The given number is perfect Number");
		}
		else {
			System.out.println("The given number is not a perfect Number");
		}
	}
}
