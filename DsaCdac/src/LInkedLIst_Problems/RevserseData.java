package LInkedLIst_Problems;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class RevserseData {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        LinkedList<Integer> list=new LinkedList<>();
	        Stack<Integer> s=new Stack<>();
	        
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);
	        
	        int size=list.size();
	        while(size>0) {
	        	s.push(list.removeFirst());
	        	
	        	list.addFirst(s.pop());
	        	 
	        	size--;
	        }
	       
	        System.out.print(" "+ list);
	        

	      
	        

	    
	}
}
