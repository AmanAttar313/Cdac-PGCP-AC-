package logicBuilding;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter number");
		int number=sc.nextInt();
		
		boolean prime =true;
		if(number<2) {
			prime=false;
		}
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	
	}

}
