package LInkedLIst_Problems;
import java.util.LinkedList;
import java.util.Scanner;


	//Clockwise rotation for n turns, n entered by the user 

	public class Rotate_Clockwise
	{
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        LinkedList<Integer> list=new LinkedList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);
	        System.out.println("ENter number of rotation:");
	        int n=sc.nextInt();
//	        while(n>0) {
//	        	list.addLast(list.removeFirst());
//		        System.out.println(list);
//		        n--;
//	        }
	        
	        // for anticlockwise
	        while(n>0) {
        	list.addFirst(list.removeLast());
	        System.out.println(list);
	        n--;
        }
	      
	        

	    }
	}


