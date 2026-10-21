package Stack;

import java.util.Stack;

public class BinaryToDec {
	public static void main(String args[]) {
		Stack<Character>s=new Stack<>();
		String binary="1011";
		
		for(Character c:binary.toCharArray()) {
			s.push(c);
		}
		
		int power=0;
		int decimal=0;
		
		while(!s.empty()) {
			int digit=s.pop()-'0';
			decimal=decimal+digit*(int)Math.pow(2, power);
			power++;
			
		}
		System.out.println(decimal);
	}
}
