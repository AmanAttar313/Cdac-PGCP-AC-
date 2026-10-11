package Assignments10_5_2026;

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter array elements:");

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter k:");
        int k=sc.nextInt();

        // If k is greater than n
        k = k % n;

        // Rotate array k times
        for (int r=1;r<=k;r++) {

            // Store last element
            int last=arr[n-1];

            // Shift elements to the right
            for (int i = n-1;i > 0;i--) {
                arr[i]=arr[i-1];
            }

            // Put last element at first position
            arr[0] = last;
        }

        System.out.println("Array after rotation:");

        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}