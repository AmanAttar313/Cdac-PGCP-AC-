package StackCollection;

import java.util.Stack;



	public class InfixToPrefix {

	    static int precedence(char ch) {
	        if (ch == '+' || ch == '-') {
	            return 1;
	        } 
	        else if (ch == '*' || ch == '/') {
	            return 2;
	        } 
	        else if (ch == '^') {
	            return 3;
	        }

	        return 0;
	    }

	    public static void main(String[] args) {

	        String infix = "9-(5+3)*4/6";

	        Stack<String> val = new Stack<>();
	        Stack<Character> op = new Stack<>();

	        for (int i = 0; i < infix.length(); i++) {

	            char ch = infix.charAt(i);

	            // 1. Operand
	            if (Character.isLetterOrDigit(ch)) {

	                String s = "" + ch;
	                val.push(s);
	            }

	            // 2. Opening bracket
	            else if (ch == '(') {

	                op.push(ch);
	            }

	            // 3. Closing bracket
	            else if (ch == ')') {

	                while (!op.isEmpty() && op.peek() != '(') {

	                    String v2 = val.pop();
	                    String v1 = val.pop();
	                    char o = op.pop();

	                    String t = o + v1 + v2;

	                    val.push(t);
	                }

	                // Remove '('
	                if (!op.isEmpty()) {
	                    op.pop();
	                }
	            }

	            // 4. Operator
	            else {

	                while (!op.isEmpty()
	                        && op.peek() != '('
	                        && precedence(op.peek()) >= precedence(ch)) {

	                    String v2 = val.pop();
	                    String v1 = val.pop();
	                    char o = op.pop();

	                    String t = o + v1 + v2;

	                    val.push(t);
	                }

	                op.push(ch);
	            }
	        }

	        // 5. Remaining operators
	        while (!op.isEmpty()) {

	            String v2 = val.pop();
	            String v1 = val.pop();
	            char o = op.pop();

	            String t = o + v1 + v2;

	            val.push(t);
	        }

	        // Final Prefix
	        String prefix = val.pop();

	        System.out.println("Infix  : " + infix);
	        System.out.println("Prefix : " + prefix);
	    }
	}
		
		
	