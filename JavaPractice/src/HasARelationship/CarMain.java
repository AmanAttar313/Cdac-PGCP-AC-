package HasARelationship;

public class CarMain {

	public static void main(String[] args) {
		Car oldCar=new Car();
		System.out.println("Car name : "+oldCar.getCarName());
		
		System.out.println("Car Color : "+oldCar.getColor());
		System.out.println("Car Color : "+oldCar.getOnRoadPrice());
		
		
		// explicit Explicit reference
		Engine oldEngine=oldCar.getNewEngine();
		String oldPower=oldEngine.getPower();s
		System.out.println("Power : "+oldPower);
		
		//2. using object Graph Navigation
		String power=oldCar.getNewEngine().getPower();
		
		
//		===========================================================================
		Car newCar=new Car();
		
		System.out.println("car name : "+newCar.getOnRoadPrice());
		
		Engine newEngine=new Engine("3000CC","pertrol");
		
		MusicSystem newMusic=new MusicSystem("EDM",15);
		
//		newCar=new Car("BMW",1526633,"white",newEngine,null);
		newCar=new Car("BMW",1526633,"white",newEngine,newMusic);
		
		MusicSystem ms=newCar.getNewSystem();
		if(ms!=null) {
			String soundeffect=ms.getSoundEffect();
			System.out.println(soundeffect);
		}else {
			System.out.println("this car does not have music system.");
		}
		
		
	}

}
