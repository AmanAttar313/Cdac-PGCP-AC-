package Assignments10_5_2026;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		float avg=0;
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Element into array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		
		for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				sum+=arr[i];
		}
		System.out.println("");
		avg=(float)sum/size;
		
		System.out.println("Sum of Array is : "+sum);
		System.out.printf("Average of Array is : %.2f%n", avg);
		
	}
}
