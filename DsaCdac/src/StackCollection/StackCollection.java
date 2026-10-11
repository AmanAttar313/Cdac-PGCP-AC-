package StackCollection;

import java.util.Scanner;
import java.util.Stack;

public class StackCollection {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	      

	     int e=0;
	     

	       
	       

	        // Create the stack
	        // TODO: Call createStack() method
	        Stack<Integer>s=new Stack<>();
	        int choice;
	        do {

	            System.out.println("\n\nSTACK MENU");
	            System.out.println("-------------------------");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Print Stack");
	            System.out.println("0. Exit");
	            System.out.println("-------------------------");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	           
	            switch (choice) {

	                case 1:
	                    // PUSH
	                    // Accept an element from user
	                	
	                    System.out.print("Enter element: ");
	                    	e = sc.nextInt();
		                    s.push(e);
	                    
	                    
	                    
	                    

	                    // TODO:
	                    // Before pushing, check whether stack is full
	                    //
	                    if (!s.isEmpty())
	                    {
	                        System.out.println("Stack is Full");
	                    }
	                    else//not full then push
	                    {
	                        s.push(e);
	                    }
	                    break;


	                case 2:
	                    // POP
	                    // TODO:
	                    // Before popping, check whether stack is empty
	                    //
	                    if (s.isEmpty())
	                    {
	                        System.out.println("Stack is Empty");
	                    }
	                    else
	                    {
	                        e = s.pop();
	                        System.out.println("Deleted element: " + e);
	                    }
	                    break;


	                case 3:
	                    // PEEK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                    if (s.isEmpty())
	                    {
	                        System.out.println("Stack is Empty");
	                    }
	                    else
	                    {
	                        e = s.peek();
	                        System.out.println("Top element: " + e);
	                    }
	                    break;


	                case 4:
	                    // PRINT STACK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                    if (s.isEmpty())
	                    {
	                        System.out.println("Stack is Empty");
	                    }
	                    else
	                    {
	                    	System.out.println("Stack is:\n"+s);
	                    }
	                    break;


	                case 0:
	                    System.out.println("Exiting Stack Program...");
	                    break;


	                default:
	                    System.out.println("Wrong choice!");

	            }

	        } while (choice != 0);

	        sc.close();
	    }

}
