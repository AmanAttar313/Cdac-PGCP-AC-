package Array;

public class SimpleArray {
	public static void main(String[] args) {
		//Declaring Array
		float[] temperatures=new float[5];
		//Initializing Array
		temperatures[0]=29.3f;
		temperatures[1]=40.3f;
		temperatures[2]=49.9f;
		temperatures[3]=19.7f;
		temperatures[4]=15.3f;
		
		System.out.println(temperatures[0]);
		
		//every array in java is iteself object
		//every array stored and heap and reference stored in stack
		
		int size=temperatures.length;
		
//		for(int i=0;i<size;i++) {
//			float temp=temperatures[i];
//			System.out.println(temp);
//		}
		
		for(float t : temperatures) {
			System.out.println(t);
		}
	}
}
