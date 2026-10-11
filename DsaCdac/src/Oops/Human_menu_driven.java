package Oops;
import java.util.Scanner;
public class Human_menu_driven {
	

	
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        String name,gender;
	        Human_2 h=new Human_2();
	        int choice=0;
	        boolean flag=false;
	        do {
	            //menu
	            System.out.print("\nOperations");
	            System.out.print("\n--------------------------------------");
	            if(flag==false) {
	            	 System.out.print("\n1.Human object ");
	            }else if(flag==true) {
	            	System.out.print("\n2.Display already set human details. ");
		            System.out.print("\n3.Update details.");
		            System.out.print("\n0.Exit the system. ");
	            }
	           
	            
	            System.out.print("\n--------------------------------------");
	            System.out.print("\n:");
	            
	            
	            choice=sc.nextInt();//choice
	          
	            //switch
	            switch(choice)
	            {
	                case 1:
	                	if(flag==false) {
	                		System.out.print("\nEnter name:");
		                    name=sc.next();
		                    System.out.print("\nEnter gender:");
		                    gender=sc.next();
		                    h.set_Human(name,gender);
		                    System.out.print("\ninput save...");
		                    flag=true;
		                    break;
	                	}
	                	
	                    
	                case 2:
	                	
	                    h.display_Human();
	                    flag=true;
	                    break;
	                case 3:
	                	
	                    h.display_Human();
	                    System.out.print("\n1.change name\n2.change gender\n:");
	                    int ch=sc.nextInt();
	                    if(ch==1)
	                    {
	                        System.out.print("\nEnter name:");
	                        name=sc.next();
	                        gender=h.get_gender();
	                        h.set_Human(name,gender);
	                        System.out.print("\nUpdated");

	                    }
	                    else if(ch==2)
	                    {
	                        System.out.print("\nEnter gender:");
	                        gender=sc.next();
	                        name=h.get_name();
	                        h.set_Human(name,gender);
	                        System.out.print("\nUpdated");
	                    }
	                    else
	                    {
	                        System.out.print("\nWrong option");
	                    }
	                    flag=true;
	                    break;
	                case 0:
	                    System.out.print("\nIn this system ");
	                    
	                    break;
	                default:
	                    System.out.print("\nWrong option");
	                    break;
	            }

	        }while(choice!=0);

	    }

}
