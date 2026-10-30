package dessert; // it must be  1st stmt if used


import food_item.Fruit; //it must be used before class defination  and after pacakge stmt  // unQualified name by achive using only import

public class IceCream {
	public static void makeMangoIceCream() {
		Fruit f =new Fruit();
	}
	public static void makeFruitIceCream() {
//		food_item.Fruit mangoes=new food_item.Fruit();  // // food_item.Fruit ==> using qualified name approch 
													//	//we use package name of class then class name 
						// // disadvantage of that alway write package name and class name but using import  
		// means unQualified write once use without name of package
		
	}
	
	
}
