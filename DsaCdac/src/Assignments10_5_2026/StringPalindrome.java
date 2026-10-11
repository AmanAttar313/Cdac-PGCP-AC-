package Assignments10_5_2026;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter Text");
	String text=sc.nextLine().toLowerCase();
	String reverse="";
	
	int last=text.length()-1;
	
	for(int i=last;i>=0;i--) {
		 reverse=reverse+text.charAt(i);
		
		
	}
	if(reverse.contains(text)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	}
}
