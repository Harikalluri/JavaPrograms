package NumberRelatedPrograms;

import java.util.Scanner;

public class SumofEachDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;

		}
		System.out.println(sum);
	}
}
