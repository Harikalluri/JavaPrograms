package ArrayRelatedPrograms;

import java.util.Arrays;

public class UnionOfTwoArrayWithInbuilt {

	public static void main(String[] args) {
		int arr1[]= {10,02,50,40,80};
		int arr2[]= {1,2,3,4,5,8};
		
		int arr[]=new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(arr));
	}
}
