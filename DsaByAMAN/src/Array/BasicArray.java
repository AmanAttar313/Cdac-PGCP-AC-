package Array;

import java.util.*;

public class BasicArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int avg=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		System.out.println("enter size of array");
		int size= sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("enter data into array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
			System.out.print(arr[i]+" ");
		}
		avg=sum/size;
		System.out.println();
		System.out.println("Sum of array is : "+sum);
		System.out.println("average  of array is : "+avg);
		System.out.println("min  of array is : "+min);
		System.out.println("max  of array is : "+max);
		
	}
}
