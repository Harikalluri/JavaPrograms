package NumberRelatedPrograms;

import java.util.Scanner;

public class nthPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for (int j = 2; j <= 100; j++) {
			int no = j;
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if (count == n) {
					System.out.println(no+" is "+n+"th prime");
				}
			}
		}
	}
}
