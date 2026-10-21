package HashMap;

import java.util.HashMap;



public class StudentManagementSystem {
	public static void main(String[]args) {
		HashMap<Integer,Student>list=new HashMap<>();
		Student s1=new Student();
		 
	        //add
	        Student s1=new Student();
	        s1.set_data(1,"aaaaa","m",9.8f);
	        list.put(s1.get_rollno(), s1);
	        //searching
	        int roll_no=1;
	        if(list.containsKey(roll_no));
	        {   Student temp=list.get(roll_no);
	            temp.display_data();
	            //print
	        }

	        

	}
}
