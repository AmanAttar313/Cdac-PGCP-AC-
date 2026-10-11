package Stack;

import java.util.Stack;

public class InsertAtBottom {
	public static void main(String[]args) {
		
		
		Stack<Integer>st=new Stack<>();
		
		Stack<Integer>rt=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
			while(st.size()>0) {
				rt.push(st.pop());
				
			}
			st.push(5);
			while(rt.size()>0) {
				st.push(rt.pop());
				
			}
			System.out.println(st);
		}

}
