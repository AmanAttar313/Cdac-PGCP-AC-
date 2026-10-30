package String;

public class StringInfo {
	public static void main(String[] args) {
//		not create new object in String class so constat pool say is  equal
		String greeting ="Good";
		String greetingCopy="Good";
		System.out.println("Contant Pool "+(greeting==greetingCopy));
		
		
		////==============================================
//		create new object in String class so constat pool say is not equal
		String hello=new String();
		String hi =new String();
		
		System.out.println("Contant Pool "+(hello==hi));
	}
}
