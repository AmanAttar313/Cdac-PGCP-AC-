package HasARelationship;

public class Car {
	private String carName;
	private int onRoadPrice;
	private String color;
	private static Engine newEngine;
	private static MusicSystem newSystem;
	public Car() {
		carName="Range Rover";
		onRoadPrice=235212;
		color="Black";
		newEngine=new Engine();
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static Engine getNewEngine() {
		return newEngine;
	}
	public static void setNewEngine(Engine newEngine) {
		Car.newEngine = newEngine;
	}
	public static MusicSystem getNewSystem() {
		return newSystem;
	}
	public static void setNewSystem(MusicSystem newSystem) {
		Car.newSystem = newSystem;
	}
	public Car(String carName, int onRoadPrice, String color,Engine newEngine,MusicSystem newSystem) {
		super();
		this.carName = carName;
		this.onRoadPrice = onRoadPrice;
		this.color = color;
		this.newEngine=newEngine;
		this.newSystem=newSystem;
	}

	

}
