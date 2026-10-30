package object_class_methods;

public class EqualMain {
	public static void main(String[] args) {
//		int data=100;
//		int anotherData=100;
//		System.out.println(data==anotherData);
		
		////==================================================
		
		Planet bigPlanet=new Planet("Jupiter",16);  //// == operator check memory references not check data so we use equal method
		Planet LargePlanet=bigPlanet;
		
		System.out.println(bigPlanet==LargePlanet);  ////  output true beacuse two reference refer only one object which is --  new Planet("Jupiter",16);
		
//		//=======================================================
		
		Planet bigPlanet1=new Planet("Jupiter",16);
		Planet LargePlanet1=new Planet("Jupiter",16);;
		
		System.out.println(bigPlanet1==LargePlanet1);  //  output true beacuse two reference refer 
		////two different new object which is --  new Planet("Jupiter",16); and new Planet("Jupiter",16);
		
		/////===============================================================================
		
		System.out.println(bigPlanet1.equals(LargePlanet1)); // // deafult implementation prensent in object class perfrom same operation like == so overide equal method
		
	}
}
