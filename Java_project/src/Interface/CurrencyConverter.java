package Interface;

public interface CurrencyConverter {
	float DOLLAR_TO_RUPEE = 96.23f;
	float POUND_TO_RUPEE = 115.32f; // in interface varibale are by default static public and 
							//	final by java (hence not to declare)
	
	float doConvert(float amount); //   in interface abstract keyword not necessary for abstract method
}