package NumberRelatedPrograms;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int res=0;
		while(no!=0) {
			int rem=no%10;
			res=(res*10)+rem;
			no=no/10;
		}
		System.out.println(res);
	}
}
