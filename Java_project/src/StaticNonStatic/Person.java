package StaticNonStatic;

public class Person {
	private String name; //a new copy createrd every object
	private int age;//a new copy createrd every object
	public static int personCount; // A single copy is created for whole class
	private static int person_count;

	public static int getPerson_count() { // static 
		return person_count;
	}
	public int getAge() { // non static 
		System.out.println(person_count);
		
		return age;
	}
	
	public Person() {
	name="Doremon";
	age=36;
	personCount++;
	person_count++;
	}
	
	
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
		personCount++;
		person_count++;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		personCount++;
		person_count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
