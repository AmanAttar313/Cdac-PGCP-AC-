package OOPSjava;

public class EnggStudentMain {

	public static void main(String[] args) {
		EnggStudent e=new EnggStudent();
//		e.assignValues(101, "aman", "developer");
//		e.printValues();
		
		e.setStudentId(10);
		e.setName("aqsa");
		e.setBranch("manager");
		System.out.println("Id: "+e.getStudentId());

		System.out.println("Name: "+e.getName());
		System.out.println("Branch: "+e.getBranch());

	}

}
