package Assignments10_5_2026;
import java.util.Scanner;

public class MoveALlzero {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements:");

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int index=0;

        // Put all non-zero elements at the beginning
        for (int i=0;i<n;i++) {

            if (arr[i]!=0) {
                arr[index]=arr[i];
                index++;
            }
        }

        // Put zeros in the remaining positions
        while (index<n) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}