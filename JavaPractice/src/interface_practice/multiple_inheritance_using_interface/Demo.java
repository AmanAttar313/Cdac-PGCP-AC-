package interface_practice.multiple_inheritance_using_interface;

public class Demo implements Printable,Showable {
	public void print() {
		System.out.println("Printing");
	}
	public void show() {
		System.out.println("Showing");
	}
//	public static void main(String[] args) {
//		Demo d=new Demo();
//		 d.print();
//		d.show();
//		
//		
//	}
		
}
