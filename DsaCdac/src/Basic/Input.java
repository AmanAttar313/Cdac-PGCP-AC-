package Basic;
import java.util.Scanner;
public class Input {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number 1 ");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2 ");
		int number2=sc.nextInt();
		
		System.out.println("Addition is :"+(number1+number2));
		
		sc.close();
	}
}
