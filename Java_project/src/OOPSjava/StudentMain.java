package OOPSjava;

public class StudentMain {
	public static void main(String args[]) {
		Student s=new Student();
		Student s1=new Student();
		s.rollNo=10;
		s.name="Aman";
		s.percentage=20.5f;
		
		s1.rollNo=12;
		s1.name="Don";
		s1.percentage=80.6f;
		
		System.out.println("data of first Studnet");
		System.out.println("Roll No:"+s.rollNo);
		System.out.println("name:"+s.name);
		System.out.println("percentage:"+s.percentage);
		
		System.out.println( );
		System.out.println("data of second Studnet");
		System.out.println("Roll No:"+s1.rollNo);
		System.out.println("name:"+s1.name);
		System.out.println("percentage:"+s1.percentage);
		
		
	}
}
