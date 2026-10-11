package Oops;

public class Student {
	private int rollNo;
	private String Name;
	private String Gender;
	private int Sub1marks;
	private int Sub2marks;
	private int Sub3marks;
	private int Sub4marks;
	private int Sub5marks;
	
	
	public void setDetails(int rollNo,String Name,String Gender,int Sub1marks,int Sub2marks,int Sub3marks,int Sub4marks,int Sub5marks) {
		this.rollNo=rollNo;
		this.Name=Name;
		this.Gender=Gender;
		this.Sub1marks=Sub1marks;
		this.Sub2marks=Sub2marks;
		this.Sub3marks=Sub3marks;
		this.Sub4marks=Sub4marks;
		this.Sub5marks=Sub5marks;
	}
	
	public void calculateResult() {
		float total=Sub1marks+Sub2marks+Sub3marks+Sub4marks+Sub5marks;
		System.out.println("total : "+total);
		float percentage=(total/5);
		System.out.println("percentage : "+percentage);
		
		
	}
	public void Display() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+Name);
		System.out.println("Sub1marks: "+Sub1marks);
		System.out.println("Sub2marks: "+Sub2marks);
		System.out.println("Sub3marks : "+Sub3marks);
		System.out.println("Sub4marks : "+Sub4marks);
		System.out.println("Sub5marks : "+Sub5marks);
		calculateResult();
		
	}
	
	
	
}
