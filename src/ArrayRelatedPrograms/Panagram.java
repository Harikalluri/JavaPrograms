package ArrayRelatedPrograms;

import java.util.Scanner;
import java.util.TreeSet;

public class Panagram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		str=str.toLowerCase().replaceAll(" ", "");
		TreeSet t1=new TreeSet();
		for(int i=0;i<str.length();i++) {
			t1.add(str.charAt(i));
		}
		if(t1.size()==26) {
			System.out.println("The given String is panagram");
		}else {
			System.out.println("The given String is not a panagram");
		}
	}
}
