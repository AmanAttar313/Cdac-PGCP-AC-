package Assignments10_5_2026;

import java.util.Scanner;

public class OddAndEvenCount {
	
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			int EvenCount=0;
			int OddCount=0;
			
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
					if(arr[i]%2==0) {
						EvenCount++;
					}
					else {
						OddCount++;
					}
			}
			System.out.println("");
			
			
			System.out.println("Even : "+EvenCount);
			System.out.printf("Odd :"+ OddCount);
			
		
	}

}
