package Assignments10_5_2026;


	

	import java.util.Scanner;

	public class CountFrequency {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int size=sc.nextInt();

	        int arr[]=new int[size];
	        boolean visited[] = new boolean[size];

	        System.out.println("Enter array elements:");

	        for (int i=0; i<size; i++) {
	            arr[i]=sc.nextInt();
	        }

	        for (int i=0;i<size;i++) {

	            if (visited[i] == true) {
	                continue;
	            }

	            int count = 1;

	            for (int j= i+1;j<size;j++) {

	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            System.out.println(arr[i]+"  "+count);
	        }

	        sc.close();
	    }
	
}
