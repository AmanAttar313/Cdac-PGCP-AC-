package Assignments10_5_2026;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		
		System.out.println("Enter Element into array : ");
		for(int p=0;p<arr.length;p++) {
			arr[p]=sc.nextInt();
		}
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
		}
		
		System.out.println("reversed array ");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}
}
