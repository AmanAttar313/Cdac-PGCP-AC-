package logicBuilding;

import java.util.Scanner;

public class areaOfRectangle {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length");
		int lentgh=sc.nextInt();
		System.out.println("Enter breadth");
		int Breadth=sc.nextInt();
		
		System.out.println("area of rectangle : "+(lentgh*Breadth));
	}
}