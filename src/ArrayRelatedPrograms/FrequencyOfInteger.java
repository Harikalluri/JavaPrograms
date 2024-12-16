package ArrayRelatedPrograms;

import java.util.HashMap;
import java.util.Map;


public class FrequencyOfInteger {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,4,3,4,5,6,8,1,1};
		int max=0;
		int no=0;
		
		HashMap<Integer, Integer> h1=new HashMap<Integer, Integer>();
		for(Integer s:arr) {
//			if(h1.containsKey(s)) {
//				h1.put(s, h1.get(s)+1);
//			}else {
//				h1.put(s, 1);
//			}
			h1.put(s, h1.getOrDefault(s, 0)+1);
			
		}
		for(Map.Entry<Integer, Integer> m:h1.entrySet()) {
			if(m.getValue()>max) {
				max=m.getValue();
				no=m.getKey();
			}
			
		}
		System.out.println(no+"--->"+max);
	}
}
