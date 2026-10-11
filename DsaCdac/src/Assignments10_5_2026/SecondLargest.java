	package Assignments10_5_2026;
	
	import java.util.Scanner;
	
	public class SecondLargest {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			int max=Integer.MIN_VALUE;
			int secondMax=Integer.MIN_VALUE;
			
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
						secondMax=max;
						max=arr[i];
					}
					else if(arr[i] > secondMax && arr[i] != max) {
						secondMax=arr[i];
					}
			}
			System.out.println("");
			if(secondMax == Integer.MIN_VALUE) {
			    System.out.println("Second Largest = -1");
			} else {
			    System.out.println("Second Largest = " + secondMax);
			}
			
			
			System.out.println("Largest = "+max);
			
			
		
	
	
	}
	}
