package LinkedList;

import java.util.Scanner;

public class MenuDrivenLinkedList {
		//menudrive main
		public static void main(String[] args)
			{
		    	Scanner sc = new Scanner(System.in);
		    	
		    	
		    	
		 
		    	int choice = 0, data;
		    	Node n=new Node(100);
		    	do
		    	{
		        	System.out.print("\n\nLinkedList Menu");
		            System.out.print("\n-----------");
		        	System.out.print("\n1. insert left");
		        	System.out.print("\n2. insert right");
		        	System.out.print("\n3. delete_left");
		        	System.out.print("\n4. delete_right");
		        	System.out.print("\n5. print list");
		        	System.out.print("\n6. search_list");
		        	System.out.print("\n7. insert_after");
		        	System.out.print("\n8. specific delete_element");
		        	System.out.print("\n0. Exit");
		        	System.out.print("\nEnter choice: ");
		 
		        	choice = sc.nextInt();
		 
		        	switch(choice)
		        	{
		            	case 1:
		                	
		                	  System.out.print("Enter element: ");
		                    	data = sc.nextInt();
		                    	n.insert_left(data);
		                    	
		                	
		                	break;
		 
		            	case 2:

		                	  System.out.print("Enter element: ");
		                    	data = sc.nextInt();
		                    	n.insert_right(data);
		                	
		                	break; 
		 

		            	case 3:
		                	
	                    	n.delete_left();
		                	break;
		                	
		            	case 4:
		                	
	                    	n.delete_right();
		                	break;
		                	
		            	case 5:
		                	
	                    	n.print_list();
		                	break;
		                	
		            	case 6:
		                	System.out.print("Enter element: ");
	                    	data = sc.nextInt();
	                    	n.search_list(data);
		                	break;
		            	case 7:
		                	System.out.print("Enter element: ");
		                	data = sc.nextInt();
		                	System.out.print("Enter reference: ");
		                	int ref=sc.nextInt();
	                    	
	                    	n.insert_after(ref,data);
		                	break;
		            	case 8:
		                	System.out.print("Enter element: ");
	                    	data = sc.nextInt();
	                    	n.delete_element(data);
		                	break;
		 
		            	case 0:
		                    System.out.print("\nExiting... coded by Amar Career Credentials");
		                	break;
		 
		            	default:
		                    System.out.print("Invalid choice");
		        	}
		 
		    	} while(choice != 0);
			}


	

}
