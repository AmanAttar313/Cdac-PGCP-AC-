package Interface;

public class DollarToRupeeConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInDollars) {
		// it is not necessary that paramter same as parent class methods  amountInDollars and amount 
		
		float amountInRupees=amountInDollars * DOLLAR_TO_RUPEE;
		
		return amountInRupees;
	}
	
}
