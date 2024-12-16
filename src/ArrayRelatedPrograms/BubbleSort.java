package ArrayRelatedPrograms;


import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		
//		This is for array dynamic input
		
//		Scanner scanner=new Scanner(System.in);
//		int size=scanner.nextInt();
//		int arr[]=new int[size];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=scanner.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		int []arr= {12,32,10,24,2};
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
