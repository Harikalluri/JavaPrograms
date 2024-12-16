package NumberRelatedPrograms;

import java.util.Scanner;


//  Sum of the Square of the digits until getting single 
//digit and if that single digit is equals to 1 or 7 then the
//number is called "happy number"

public class HappyNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		while(no>9) {
			no=numSum(no);
		}
		if(no==1||no==7) {
			System.out.println("The given number is Happy Number");
		}else {
			System.out.println("The given number is not an Happy Number");
		}
		
	}

	 static int numSum(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem*rem;
			no=no/10;
		}
		return sum;
	}
}
