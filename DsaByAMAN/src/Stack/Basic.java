package Stack;

import java.util.Stack;

public class Basic {
	public static void main(String[]args) {
		Stack<Integer>st=new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		System.out.println(st.peek());
		
//		st.pop();
//		System.out.println(st);
//		System.out.println("Size : "+st.size());
		
		// all element will be poped and last one peek element remain
		while(st.size()>1) {
			st.pop();
		}
		System.out.println(st.peek());
		System.out.println(st);
	}
}
