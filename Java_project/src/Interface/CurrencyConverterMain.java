package Interface;

public class CurrencyConverterMain {
	public static void main(String[] args) {
		
		System.out.println("Today exchange rate: ");
		System.out.println("USD TO INR : "+CurrencyConverter.DOLLAR_TO_RUPEE);
		
		CurrencyConverter converter;
		converter= new DollarToRupeeConverter();
		float rupees=converter.doConvert(50000);
		System.out.println("$5000 =  Rs."+rupees);
		System.out.println("==============================");
		
		converter =new RupeeToPoundConverter();
		float pounds=converter.doConvert(150000);
		System.out.println("Rs.150000 =  GBP."+pounds);
	}
}
