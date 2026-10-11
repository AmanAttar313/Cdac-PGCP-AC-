package Oops2;

import java.util.Scanner;

public class HumanMainMenu {
	public static void main(String[] args) {
        Human h[]=new Human[10];//We created an array of objects but each object did not get its own memory.
        Scanner sc = new Scanner(System.in);
        int index=0;
        String name,gender,adhar;
        boolean found=false;
        int choice=0;
        do {
            System.out.print("\nHuman management system ");
            System.out.print("\n--------------------------------------");
            System.out.print("\n1.New Human Registration");
            System.out.print("\n2.Display List");
            System.out.print("\n3.Search Human by Adhar");
            System.out.print("\n4.Delete Human by Adhar");
            System.out.print("\n0.Exit the system. ");
            System.out.print("\n--------------------------------------");
            System.out.print("\n:");
            choice=sc.nextInt();//choice
            //switch
            switch(choice)
            {
                case 1:
                	sc.nextLine();////escape line use enter to go to next
                    System.out.println("Enter name:");
                    name=sc.nextLine();
                    
                    System.out.println("Enter gender:");
                    gender=sc.next();
                 
                    System.out.println("Enter adhar card number:");
                    adhar=sc.next();
                   
                    h[index]=new Human();//We allocated a memory block for a human object.
                    h[index].set_Human(name,gender,adhar);
                    index++;
                    break;
                case 2:
                    for(int i=0;i<index;i++)
                        h[i].display_Human();
                    break;
                case 3:
                    //read adhar
                    //search is found then display else not found
                    System.out.println("Enter adhar card number to search:");
                    adhar=sc.next();
                    found=false;
                    for(int i=0;i<index;i++)
                    {
                        if(adhar.equals(h[i].get_adhar()))//adhar==h[i].get_adhar()
                        {
                            h[i].display_Human();
                            found = true;
                        }
                    }
                    if(found==false)
                        System.out.print("\nGiven details not found in record. ");
                    break;
                case 4:
                	found=false;
                    for(int i=0;i<index;i++)
                    {
                        if(adhar.equals(h[i].get_adhar()))//adhar==h[i].get_adhar()
                        {
                            h[i].display_Human();
                            found = true;
                            System.out.println("found and Deleted");
                            for(int j=0;j<index-1;j++) {
                            	h[j]=h[j+1]; //copy last previous
                            }
                            index--; // final count-1 as one record got deleted 
                            break;
                        }
                    }
                    
                    break;
                case 0:
                    System.out.print("\nExiting the system...... ");
                    break;
                default:
                    System.out.print("\nWrong option");
                    break;
            }


        }while(choice!=0);

    }

	
}
