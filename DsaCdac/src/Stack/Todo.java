package Stack;

import java.util.Scanner;

public class Todo {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	       Stack_basic s = new Stack_basic();

	        int size;
	        int choice;
	        int e;
	        int stack[],MaxSize,tos;


	        // Ask user for stack size
	        System.out.print("Enter stack size: ");
	        size = sc.nextInt();

//	         Create the stack
//	         TODO: Call createStack() method
//	         s.____________________;
	        
	      


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
	                	void push(int e)
	                    {
	                        stack[++tos]=e;
	                        //tos++;stack[tos]=e;
	                    }

	                    System.out.print("Enter element: ");
	                    e = sc.nextInt();

	                    // TODO:
	                    // Before pushing, check whether stack is full
	                    //

	                    boolean is_full()
	                    {
	                        return (tos==MaxSize-1);//boundry condition
	                    }


	                    break;


	                case 2:
	                    // POP
	                    // TODO:
	                    // Before popping, check whether stack is empty
	                    //
	                    // if (____________________)
	                    // {
	                    //     System.out.println("Stack is Empty");
	                    // }
	                    // else
	                    // {
	                    //     e = s.____________________;
	                    //     System.out.println("Deleted element: " + e);
	                    // }
	                	 boolean is_empty()
	                	    {
	                	        return tos==-1;
	                	    }
	                	  int pop()
	                	//removes and return
	                	    {
	                	        return stack[tos--];
	                	    }


	                    break;


	                case 3:
	                    // PEEK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                    // if (____________________)
	                    // {
	                    //     System.out.println("Stack is Empty");
	                    // }
	                    // else
	                    // {
	                    //     e = s.____________________;
	                    //     System.out.println("Top element: " + e);
	                    // }
	                	boolean is_empty()
                	    {
                	        return tos==-1;
                	    }
	                	 	int peek()//returns the element on the stack that is at the top.
	                	    {
	                	        return stack[tos];//only return not removed
	                	    }

	                    break;


	                case 4:
	                    // PRINT STACK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                    // if (____________________)
	                    // {
	                    //     System.out.println("Stack is Empty");
	                    // }
	                    // else
	                    // {
	                    //     s.____________________;
	                    // }
	                	
	                	 void print_stack()
	                	    {
	                	        for(int i=tos;i>=0;i--)
	                	            System.out.println(stack[i]);
	                	    }
	                	 boolean is_empty()
	                	    {
	                	        return tos==-1;
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
