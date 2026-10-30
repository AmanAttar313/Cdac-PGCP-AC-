package staticNonStatic;

public class Person {
	private String name;
	private int age;
	public static int personCount;
	private static int person_count;
//	public Person() {
//		name="aman";
//		age=18;
//		personCount++;
//		person_count++;
//	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		personCount++;
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		personCount++;
	}
	


}
