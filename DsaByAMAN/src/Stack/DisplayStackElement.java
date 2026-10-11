package Stack;

import java.util.Stack;

public class DisplayStackElement {
	
	// // by recursion
	
	public static void displayReverseRec(Stack<Integer>s) {
		if(s.size()==0) return;
		int top=s.pop();
		System.out.print(top+" ");
		displayReverseRec(s);
		s.push(top);
	}
	public static void displayRec(Stack<Integer>s) {
		if(s.size()==0) return;
		int top=s.pop();
		
		displayRec(s);
		System.out.print(top+" ");
		s.push(top);
	}
	public static void main(String[]args) {
		Stack<Integer>st=new Stack<>();
		
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		
		Stack<Integer>temp=new Stack<>();
		
//			while(st.size()>0) {
//				temp.push(st.pop());
//			}
//			
//			while(temp.size()>0) {
//			int x=temp.pop();
//			System.out.println(x);
//			st.push(x);
//				
//			}
		
			// // using array
//		int n=st.size();
//		int arr[]=new int[n];
//		for(int i=n-1;i>=0;i++) {
//			arr[i]=st.pop();		
//			
//		}
//			for(int i=0;i<=n;i++) {
//				System.out.print(arr[i]+" ");
//				st.push(arr[i]);		
//			}
//		
			
			// by recursion
			
		//displayReverseRec(st);
		displayRec(st);
	}
}
