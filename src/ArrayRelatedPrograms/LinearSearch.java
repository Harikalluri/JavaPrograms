package ArrayRelatedPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int []arr= {10,20,3,0,40,5};
		int searchNo=scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==searchNo) {
				System.out.println("The search number "+searchNo+" is found in the index "+i);
				return;
			}
		}
		System.out.println("The number is not found");
	}
}
