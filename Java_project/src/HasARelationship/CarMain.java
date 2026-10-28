package HasARelationship;

public class CarMain {

	public static void main(String[] args) {
		Car simpleCar;// this car does not have music system 
		simpleCar=new Car();
		// printing description of simple car
		System.out.println(simpleCar.getDescription());
		
		//printing power of engine avialabe in simple car
		
		// 1.Using Explicit reference
		Engine simpleEngine=simpleCar.getCurrentEngine();
		String simplepower=simpleEngine.getPower();
		System.out.println("Using Explicit reference: "+simplepower);
		
		//2. using object Graph Navigation
		String simplePower2=simpleCar.getCurrentEngine().getPower();
		System.out.println("using object Graph Navigation : "+simplePower2);
		
		///==========================================================
		System.out.println("=========================================================="); 
		
		Car primiumCar; //this car has music System
		Engine premiumEngine=new Engine("2600cc","Disel");
		MusicSystem premiumMusicSystem=new MusicSystem("Sony","Poly tone");
		primiumCar=new Car("Toyota Fortuner",280000,premiumEngine,premiumMusicSystem);
		
		System.out.println(primiumCar.getDescription());
		
		
		System.out.println(primiumCar.getCurrentEngine().getFuel());
		
		//printing sound effect of music system availabe in premium car
	//	System.out.println(primiumCar.getCurrenMusicSystem().getSoundEffect()); // not recommended
		
		MusicSystem ms=primiumCar.getCurrenMusicSystem();
		if(ms!=null) {
			String soundEffect=ms.getSoundEffect();
			System.out.println(soundEffect);
		}else {
			System.out.println("this car does not have music system.");
		}
		
	}

}
