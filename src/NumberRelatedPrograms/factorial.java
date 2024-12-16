package NumberRelatedPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		int mul=1;
		for(int i=no;i>=1;i--) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
