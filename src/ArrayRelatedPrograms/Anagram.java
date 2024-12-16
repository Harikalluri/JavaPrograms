package ArrayRelatedPrograms;

import java.util.Arrays;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		if (str1.length() == str2.length()) {
			
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("The given Strings are  Anagram");
			}else {
				System.out.println("The given Strings are not an Anagram");
			}

		} else {
			System.out.println("The given Strings are not anagram");
		}
	}
}
