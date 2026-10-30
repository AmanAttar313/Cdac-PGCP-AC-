package Abstraction;

final public class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle using some scale");

	}

	@Override
	public void findArea() {
		System.out.println("Finding area using formula : 3.14 * radius * radius");

	}

}
