package exception_handling;

public class DefaultExceptionHandlerMain {
	   static void show() {
	        System.out.println("Hello");
	        show(); // Calls itself repeatedly
	    }
	public static void main(String[] args) {
		// program accepts 2 numbers as command line argumnets and prints thier sum
		
		try {
//			int x =Integer.parseInt(args[0]);
//			int y =Integer.parseInt(args[1]);
//			int result=x/y;
//			
//			System.out.println(result);
		show();
//			for(Integer i=0;i<250000000;i++ ) {
//				new WithExceptionHandlerMain();
//				System.out.println("object created..");
//			}
		}
		
		
		
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Enter at least 2 numbers : ");
//		}
//		catch(ArithmeticException ex) {
//			System.out.println("Enter second values as Non Zero");
//		}
		
		catch(ArithmeticException |ArrayIndexOutOfBoundsException ex) {
			if(ex instanceof ArithmeticException )
				System.out.println("Enter second values as Non Zero");
			else
				System.out.println("Enter at least 2 numbers : ");	
		}
		
		// catch block of child class must appear by parent class 
//		catch(Exception ex) {
//			System.out.println("general error...");
//		}
		
		catch(Error ex) {
			System.out.println("general error...");
		}
//		catch(Throwable ex) {
//			System.out.println("general error...");
//		}
		
		
	}
}
