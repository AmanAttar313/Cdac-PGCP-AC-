package interface_practice;

public class MyCalculator implements Calculator{
	
	@Override
	public float add(float num1,float num2) {
		return num1+num2;
	}

	@Override
	public float sub(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
