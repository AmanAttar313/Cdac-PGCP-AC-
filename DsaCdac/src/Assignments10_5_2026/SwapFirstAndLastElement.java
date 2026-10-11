package Assignments10_5_2026;

import java.util.Scanner;

public class SwapFirstAndLastElement {
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Element into array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int first=0;
		int last=arr.length-1;
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
