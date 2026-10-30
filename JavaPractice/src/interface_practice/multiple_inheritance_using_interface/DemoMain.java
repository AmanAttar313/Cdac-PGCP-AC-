package interface_practice.multiple_inheritance_using_interface;

public class DemoMain {
	public static void main(String[] args) {
		Printable p;
		Showable s;
		p=new Demo();
		s=new Demo(); 
		s.show();
		p.print();
		
	}
}
