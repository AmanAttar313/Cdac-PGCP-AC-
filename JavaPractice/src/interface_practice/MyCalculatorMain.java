package interface_practice;

public class MyCalculatorMain {
	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		
		System.out.println("Addition is :"+obj.add(10, 5));
		
		System.out.println("Substraction is :"+obj.sub(10, 5));
	}
}
