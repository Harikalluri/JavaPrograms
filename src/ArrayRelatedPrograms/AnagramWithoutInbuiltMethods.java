package ArrayRelatedPrograms;

import java.util.Scanner;

public class AnagramWithoutInbuiltMethods {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		System.out.println(anagram(str1,str2));
	}

	 static String anagram(String str1, String str2) {
		int []arr=new int[128];
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<str2.length();i++){
			char ch=str2.charAt(i);
			arr[ch]--;
		}
		for(int i=65;i<123;i++) {
			if(arr[i]!=0) {
				return "not an angram";
			}
		}
		return "anagram";
		
		 
	}
}
