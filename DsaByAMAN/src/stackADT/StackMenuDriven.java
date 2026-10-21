package stackADT;

import java.util.Scanner;

public class StackMenuDriven {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	StackClass s=new StackClass();
	int choice;
	int value;
	
	System.out.println("Enter Size of Stack");
	int size=sc.nextInt();
	s.createStack(size);
	
	do {
		System.out.println("--------------Menu Driven ADT STACK----------");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("4.print");
		System.out.println("5.Search");
		System.out.println("6.Exit");
		
		System.out.println("Enter Your Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			if(s.IsFull()) {
				System.out.print("Stack is Full");
			}else {
				System.out.println("Enter Element");
				value=sc.nextInt();
				s.push(value);
			}
		break;
		case 2:
			if(s.isEmpty()) {
				System.out.println("Stack is empty cannot pop element");
			}else {
				System.out.println("Popped Element: " + s.pop());
			}
			break;
		
		case 3:
			if(s.isEmpty()) {
				System.out.println("Stack is empty");
			}else {
				System.out.println("Peek Element"+s.peek());
			}
			break;
		case 4:
			if(s.isEmpty()) {
				System.out.println("Stack is empty");
			}else {
				s.print();
			}
			break;
		case 5:
			if(s.isEmpty()) {
				System.out.println("Stack is empty");
			}else {
				System.out.println("Enter Eleemnt tou want to search");
				int element=sc.nextInt();
				System.out.println(s.search(element));
				
			}
			break;
		case 6:
			System.out.println("Exiting...");
			break;
	
	default:
        System.out.println("Wrong choice!");
		}
		
		
	}while(choice!=6);
	
}
}
