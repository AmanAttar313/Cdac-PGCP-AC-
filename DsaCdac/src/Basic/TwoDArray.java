package Basic;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows=sc.nextInt();
		System.out.println("Enter columns");
		int column=sc.nextInt();
		int arr[][]=new int[rows][column];
		

		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("Enter element at arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(+arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
