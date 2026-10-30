package String_Builder;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder builder =new StringBuilder(); // created an empty String builder
//		builder.append("today is thursday date is 29/10/26");
		
		builder.append("Today is Thursday and it is day no ");
		builder.append(4);
		
		builder.append("Usuallay we have luch Break at ");
		builder.append(1.30f);
		
		builder.append("are you enjoy this training");
		builder.append(true);
		
		System.out.println(builder); //  invokes toString() from StringBuilder

	}

}
