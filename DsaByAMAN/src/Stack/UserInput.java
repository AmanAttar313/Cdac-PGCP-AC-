package Stack;

import java.util.Scanner;
import java.util.Stack;

public class UserInput {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		
		System.out.println("Enter Size of Stack");
		int size=sc.nextInt();
		
		System.out.println("Enter Elements into Stack");
		for(int i=0;i<size;i++) {
			int x=sc.nextInt();
			st.push(x);
			
		}
		System.out.println(st);
		
	}
}
