package ArrayRelatedPrograms;

public class IntersectionOfTwoArraysWithoutInbuilt {

	public static void main(String[] args) {
		int []arr1= {1,52,4,20,3,65};
		int []arr2= {1,50,20,3,65,95,76,82};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					
				}
			}
		}
	}
}
