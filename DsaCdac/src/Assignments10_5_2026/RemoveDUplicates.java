package Assignments10_5_2026;

import java.util.Scanner;

public class RemoveDUplicates {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        // index where next unique element will be stored
        int j = 1;

        for (int i=1; i<n;i++) {

            // If current element is different
            // from previous element
            if (arr[i]!=arr[i - 1]) {

                arr[j]=arr[i];
                j++;
            }
        }

        System.out.println("New Length="+j);

        System.out.println("Unique elements:");

        for (int i=0;i<j;i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}