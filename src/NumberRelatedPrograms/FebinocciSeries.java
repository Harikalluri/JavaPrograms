package NumberRelatedPrograms;

import java.util.Scanner;

public class FebinocciSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2);
		for(int i=1;i<no;i++) {
			fib3=fib1+fib2;
			System.out.print(" "+fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}
}
