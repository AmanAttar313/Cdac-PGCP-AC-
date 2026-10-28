package Array;

public class ArrayAsParamaterMain {
	private static double[] getSquareRoots(int[] allNumbers) {
		int size=allNumbers.length;
		double[] allSquareRoots=new double[size];
		int index=0;
		for(int everyNumber:allNumbers) {
			double squareRoot=Math.sqrt(everyNumber);
			allSquareRoots[index]=squareRoot;
			index++;
		}
		return allSquareRoots;
	}
	public static void main(String[] args) {
		int numbers[]= {65,12,45,87};
		
		double[] squareRoots=getSquareRoots(numbers);
		for(double squareRoot: squareRoots) {
			System.out.println(squareRoot);
		}
	}

}
