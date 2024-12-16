package ArrayRelatedPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWords {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] str1 = str.split(" ");
		
		HashMap<String, Integer> h1=new HashMap<String, Integer>();
		for(String s:str1) {
//			if(h1.containsKey(s)) {
//				h1.put(s, h1.get(s)+1);
//			}else {
//				h1.put(s, 1);
//			}
			h1.put(s, h1.getOrDefault(s, 0)+1);
			
		}
		for(Map.Entry<String, Integer> m:h1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
