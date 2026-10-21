package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			Stack<Character> s=new Stack<>();
			
			
			System.out.println("Enter Text : ");
			
			String text=sc.nextLine();
		
			String reverse="";
			
			for(Character c:text.toCharArray()) {
				s.push(c);
				reverse=s.pop()+reverse;
				
			}
			System.out.print(reverse);
			
		}
}


