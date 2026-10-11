package Assignments10_5_2026;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		boolean found=false;
		
		System.out.println("Enter Element into array : ");
		for(int p=0;p<arr.length;p++) {
			arr[p]=sc.nextInt();
		}
		
		System.out.println("enter number you want to search : ");
		int search=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				System.out.println(i);
				break;
			}
			
		}
		if(found==false){
			
			System.out.println(-1);
		 
		}
		
	}
}
