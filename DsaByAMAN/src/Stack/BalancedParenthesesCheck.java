package Stack;

import java.util.Stack;

public class BalancedParenthesesCheck {
	
	static boolean checkParenthesis(String input,Stack<Character> s) {
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
			if(ch == '(' || ch== '{' || ch=='[' ) {
			s.push(ch);	
			}
			
			else if(ch==')' ||ch==']'||ch=='}' ) {
				
				 if (s.isEmpty()) {
	                    return false;
	                }
				 char top=s.pop();
				if(ch=='}' && top!='{'|| ch==')' && top!='('||ch==']' && top!='[') {
					
					return false;
				}
			}
			
		}
		return s.isEmpty();
	}

	public static void main(String args[]) {
		Stack<Character> s =new Stack<>();
		String input="{([])}";
		System.out.print(checkParenthesis(input,s));
	
		
	}
}
