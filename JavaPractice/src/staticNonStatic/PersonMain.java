package staticNonStatic;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p=new Person(55,"don");
		Person p1=new Person("aqsa",22);
//		new Person("aqsa",22);
//		new Person("aqsa",22);
		
		System.out.println(p1.personCount);
	}

}
