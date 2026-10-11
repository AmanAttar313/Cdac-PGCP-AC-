package StackCollection;

import java.util.Scanner;
import java.util.Stack;
 
public class Reverse_Word
{
	static String reverse_word(String word)
	{
    	String rword = "";
 
        Stack<Character> stack = new Stack<>();
        
    	for(int i=0;i<word.length();i++) {
    		stack.push(word.charAt(i));
    	}
    	
    	while(!stack.isEmpty()) {
    		
    		rword=rword+stack.pop();
    		
    	}
    	
 
    	return rword;
	}
 
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
 
    	String word, rword = "";
 
        System.out.println("Enter word:");
    	word = sc.next();
 
        System.out.print("\nReverse word is:" + reverse_word(word));
	}
}


