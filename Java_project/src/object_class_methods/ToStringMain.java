package object_class_methods;

public class ToStringMain {

	public static void main(String[] args) {
		 Planet myPlanet =new Planet();
		 
		 System.out.println(myPlanet.getName());
		 System.out.println(myPlanet.getMoons());
		 
		 // // print object 
		 System.out.println(myPlanet); // implicit call toString means automatically call
		 System.out.println(myPlanet.toString()); // Explicitlyu call toString means manually call
		

	}

}
