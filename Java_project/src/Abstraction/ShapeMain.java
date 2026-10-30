package Abstraction;

public class ShapeMain {

	public static void main(String[] args) {
//		Shape sh = new Shape(); // cannot create shape class beause it is abstract
		Shape sh=new Circle();
		
		Shape sh1=new Rectangle();
		
		sh.draw();
		sh.findArea();
		sh.erase();
		System.out.println("--------------------------------------------------------------------------------");
		sh1.draw();
		sh1.findArea();
		sh1.erase();
	}

}
