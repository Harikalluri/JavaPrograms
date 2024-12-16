package StringRelatedPrograms;

import java.util.Scanner;

public class FrequencyOfUniqueElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int arr[]=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				System.out.println((char)i+"--->"+arr[i]);
			}
		}
	}
}
