package StackCollection;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
	static int to_binary(int dec_number)
	{
        Stack<Integer> stack = new Stack<>();
        int bin_number = 0;
      
    	// STUDENT: Write logic to convert decimal to binary
    	while(dec_number>0) {
    		int digit=(dec_number%2);
    		dec_number=dec_number/2;
    		stack.push(digit);
    		
    		
    	}
    	while(!stack.isEmpty()) {
    		bin_number=bin_number*10+stack.pop();
    	}
 
 
    	return bin_number;
	}
 
	public static void main(String []args) {
		
		
	    	Scanner sc = new Scanner(System.in);
	 
	    	int Dec_number;
	 
	        System.out.println("Enter number:");
	    	Dec_number = sc.nextInt();
	 
	        System.out.print("Binary is:" + to_binary(Dec_number));
		}

	
}
