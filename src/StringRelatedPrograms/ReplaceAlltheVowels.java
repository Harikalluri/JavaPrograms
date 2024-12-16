package StringRelatedPrograms;

import java.util.Scanner;

public class ReplaceAlltheVowels {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
//		str=str.replaceAll("[aeiou]", ""); it will remove [aeiou]
		str=str.replaceAll("[^aeiou]", "");//except aeiou it will remove all
		System.out.println(str);
	}
}
