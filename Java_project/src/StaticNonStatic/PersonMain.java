package StaticNonStatic;

public class PersonMain {
	static{
		System.out.println("personmain class is loaded ");
	}
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("Aman",23);
		Person p3=new Person(23,"Aqsa");
		
		// Person claas Object Count
		System.out.println("Current person COunt : "+Person.personCount); // class specific beacuse person count is static so 
		//access using class name means Person.personCount
		new Person();
		new Person("a",10);
		System.out.println("Current person COunt : "+Person.personCount);
		
		for(int i=0;i<10;i++) {
			new Person();
		}
		System.out.println("Current person COunt : "+Person.personCount);
		//====================================================================================
		System.out.println("final count of person by p1 "+p1.getPerson_count()); // same ouput of p1 and p2 beacuse class specify by static personcount
		System.out.println("final count of person by p2"+p2.getPerson_count());// this not coreect way
		System.out.println("final name "+p3.getName());
		//====================================================================================
		System.out.println("final count of person by Person class "+Person.getPerson_count()); // make methods also static so call methods using class this is appropriate method 
		
		

	}

}
