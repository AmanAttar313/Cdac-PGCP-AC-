package inner_classes;

public class Outer {
	

	private int x=10;
	private static int y=20;
	
	// // inner static class
	public static class StaticInner {
		public void print() {
			System.out.println(y);
		/////	System.out.println(x); error as x is non static
		}
	}
	
	// // inner non static class
	public class Nested {
		public void display() {
			System.out.println(y);
			System.out.println(x);
		}
	}
	
	//// Local class means class inside block
	public void showGretting(){
		class Message{
			String getGretting() {
				return "Welcome";
			}
		}
		Message msg = new Message();
		System.out.println(msg.getGretting());
	}
	
}
