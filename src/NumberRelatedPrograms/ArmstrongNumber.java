package NumberRelatedPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int n=no;//to check number of digits present in given number
		int copy=no;//to verify the result
		int count=0;
		int sum=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		while(no!=0) {
			int rem=no%10;
			sum+=Math.pow(rem, count);
			no=no/10;
		}
		if(sum==copy) {
			System.out.println("The given number is Armstrong Number");
		}else {
			System.out.println("The given number is not an Armstrong number");
		}
		
	}
}
