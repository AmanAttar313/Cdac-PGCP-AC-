package exception_handling;

public class WithoutExceptionHandlerMain {
	public static void main(String[] args) {
		// program accepts 2 numbers as command line argumnets and prints thier sum
		
		//unchecked exception => compiler does no check you handle exception or not , it still compile
		int x =Integer.parseInt(args[0]);
		int y =Integer.parseInt(args[1]);
		int result=x+y;
		
		System.out.println(result);
		
	}
}
