package inner_classes;

public class Outer {
	 private static String name;
	 private int age;
	 
	 public static String getName() {
			return name;
		}
		 public static void setName(String name) {
			 Outer.name = name;
		 }
		 public int getAge() {
			 return age;
		 }
		 public void setAge(int age) {
			 this.age = age;
		 }
	 class StaticInner{
		
		 
		 public void display() {
			 Outer.setName("Aman");
			 setAge(45);
			 System.out.println(name);
			 System.out.println(age);
			
		 }
	 }
	 public static class  StaticInner1{
		 public void display() {
			 Outer.setName("Don");
			 
			 System.out.println(name);
			
		 }
		 
	 
	
	 
	 }
	 
	 
	 
	
}
