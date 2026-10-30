package inner_classes;

public class OuterMain {
	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.StaticInner si = o.new StaticInner();
		si.display();
		
		
		Outer.StaticInner1 o1=new Outer.StaticInner1();
		o1.display();
		
		
	}
}
