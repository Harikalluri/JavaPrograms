package StringRelatedPrograms;


import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  String str=scanner.nextLine();
	  String res="";
	  for(int i=str.length()-1;i>=0;i--) {
		  res+=str.charAt(i);
	  }
	  System.out.println(res);
	
	}
}
