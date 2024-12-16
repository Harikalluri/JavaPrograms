package NumberRelatedPrograms;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no1=scanner.nextInt();
		int no2=scanner.nextInt();
		
//		with third variable
//		int temp=no1;
//		no1=no2;
//		no2=temp;
//		System.out.println(no1);
//		System.out.println(no2);
		
		
//		without third variable
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1);
		System.out.println(no2);
		
	}
}
