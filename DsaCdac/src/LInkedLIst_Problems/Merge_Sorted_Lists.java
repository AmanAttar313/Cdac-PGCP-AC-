package LInkedLIst_Problems;

import java.util.LinkedList;
import java.util.Scanner;

public class Merge_Sorted_Lists {

    // Function to merge two sorted LinkedLists
    static LinkedList<Integer> combine(
            LinkedList<Integer> l1,
            LinkedList<Integer> l2) {

        // Create the third LinkedList
        LinkedList<Integer> l3 = new LinkedList<>();
       
        
       
        
        // TODO 1: Declare two integer variables
        // to track positions in l1 and l2.
       int i=0;
      int j=0;
        
       
        while(i)

        // TODO 2: Traverse both lists while
        // elements are available in both.


        // TODO 3: Compare the current elements
        // of l1 and l2.


        // TODO 4: Add the smaller element to l3
        // and advance the corresponding position.


        // TODO 5: Add the remaining elements
        // of l1, if any.


        // TODO 6: Add the remaining elements
        // of l2, if any.

        
        // Return the merged LinkedList
        return l3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        // Input first sorted list
        System.out.print("Enter size of List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter sorted elements of List 1:");
        for (int i = 0; i < n1; i++) {
            l1.add(sc.nextInt());
        }

        // Input second sorted list
        System.out.print("Enter size of List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter sorted elements of List 2:");
        for (int i = 0; i < n2; i++) {
            l2.add(sc.nextInt());
        }

        System.out.println("List 1: " + l1);
        System.out.println("List 2: " + l2);

        // TODO 7: Call combine() by passing l1 and l2
        // Store the returned LinkedList in l3.
        


        // TODO 8: Display the merged list.


        sc.close();
    }
}