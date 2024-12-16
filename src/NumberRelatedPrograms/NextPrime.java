package NumberRelatedPrograms;

import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		int no=scanner.nextInt();
		for(int j=no+1;j<=100;j++) {
			int n=j;
			boolean flag=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("The next prime is "+n);
				break;
			}
		}
	}
}
