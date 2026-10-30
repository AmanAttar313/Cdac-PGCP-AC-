package inner_classes;

public class AnonymousInnerClassMain {
	public static void main(String[] args) {
		CurrencyConverter conveter;
		
		conveter =new CurrencyConverter() { ////anonymous class stated 
			// using  new create object of currencyConverter and then { usign parenthesis
			 //anonymous class started and end using } 
			@Override
			public float doConvert(float amount) {
				// TODO Auto-generated method stub
				return amount/8.23f;
			}
		};
		System.out.println(conveter.doConvert(5000));
	}
	
}
