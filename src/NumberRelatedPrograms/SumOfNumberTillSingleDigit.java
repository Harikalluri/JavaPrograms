package NumberRelatedPrograms;

import java.util.Scanner;

public class SumOfNumberTillSingleDigit {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		while(no>9) {
			no=numSum(no);
		}
		System.out.println(no);
	}

	 static int numSum(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem;
			no=no/10;
			
		}
		return sum;
	}
}
