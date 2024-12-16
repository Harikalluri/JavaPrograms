package NumberRelatedPrograms;

import java.util.Scanner;

public class DissariumNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int n=no;
		int copy=no;
		int count=0;
		int sum=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		while(no!=0) {
			int rem=no%10;
			sum+=Math.pow(rem, count);
			count--;
			no=no/10;
			
		}
		if(copy==sum) {
			System.out.println("The given number is an Dissarium Number");
		}else {
			System.out.println("The given number is not an Dissarium Number");
		}
	}
}