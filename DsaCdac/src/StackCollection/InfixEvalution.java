package StackCollection;

import java.util.Stack;

public class InfixEvalution {
	public static void main(String[]args) {
		String str="9-5+3*4/6";
		Stack<Integer>val=new Stack<>();
		Stack<Character>op=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int ascii=(int)ch; // '0' => 48 and '9' =>57
			if(ascii>=48 && ascii<=57) {
				
			}
		}
		
	}
}
