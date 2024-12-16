package StringRelatedPrograms;

import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int arr[]=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				System.out.println((char)i+"--->"+arr[i]);
			}
		}
	}
}
