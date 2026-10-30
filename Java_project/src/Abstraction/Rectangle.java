package Abstraction;

public class Rectangle extends Shape {

	public Rectangle() {
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle using some scale");
		
	}

	@Override
	public void findArea() {
		System.out.println("Finding area using formula : length * breadth");
		
	}
	
	// erase method cannot overriden beacuse it is 
//	@Override
//	public void erase() {
//		System.out.println("Erasing Shape using Eraser.");
//	}

}
