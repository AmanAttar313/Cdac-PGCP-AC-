package Abstraction;

public abstract class Shape {
	// generalization
	public abstract void draw(); // method is declare 
	public abstract void findArea();// abstract method
	
	final public  void erase() { // concrete method
		System.out.println("Erasing Shape using Eraser.");
	}
	public Shape() {
		
	}
}
