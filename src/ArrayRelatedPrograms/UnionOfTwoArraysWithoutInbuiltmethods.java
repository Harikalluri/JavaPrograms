package ArrayRelatedPrograms;

import java.util.Arrays;

public class UnionOfTwoArraysWithoutInbuiltmethods {

	public static void main(String[] args) {
		int arr1[]= {10,02,50,40,80};
		int arr2[]= {1,2,3,4,5,8};
		int arr[]=new int[arr1.length+arr2.length];
		int j=0;
		for (int i = 0; i < arr1.length; i++) {
			arr[j++]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[j++]=arr2[i];
		}
		Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	}
}
