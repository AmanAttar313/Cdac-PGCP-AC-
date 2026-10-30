package IsARelationship;

public class Player {
	private String name;
	private int age;
	
	public Player() {
		System.out.println("Inside player()");
	}
	
	public String getName() {
		return name;
	}
	public Player(int age, String name) {
		System.out.println("Inside player(int ,String)");
		
		this.age = age;
		this.name = name;
	}

	public Player(String name, int age) {
		System.out.println("Inside player(String,int)");
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
