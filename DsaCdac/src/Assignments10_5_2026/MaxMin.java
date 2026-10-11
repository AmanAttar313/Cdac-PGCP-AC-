package Assignments10_5_2026;

import java.util.Scanner;

public class MaxMin {
	

		
			public static void main(String[]args) {
				Scanner sc=new Scanner(System.in);
				int max=Integer.MIN_VALUE;
				int min=Integer.MAX_VALUE;
				
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
						if(arr[i]>max) {
							max=arr[i];
						}
						if(arr[i]<min) {
							min=arr[i];
						}
				}
				System.out.println("");
				
				
				System.out.println("Largest = "+max);
				System.out.printf("Smallest = "+ min);
				
			
		

	}

}
