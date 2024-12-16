package NumberRelatedPrograms;

import java.util.Scanner;

public class FrequencyOfUniqueNumbers {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		String str=String.valueOf(no);
		
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
