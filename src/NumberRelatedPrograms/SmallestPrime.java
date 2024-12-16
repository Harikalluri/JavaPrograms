package NumberRelatedPrograms;

import java.util.Scanner;

public class SmallestPrime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		while(no>no/2) {
			boolean flag=true;
			for(int i=2;i<Math.sqrt(no);i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(no+" is the smallest prime");
				break;
			}
			no--;
		}
	}
}
