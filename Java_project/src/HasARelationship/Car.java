package HasARelationship;

public class Car {
	private String description;
	private int onRoadPrice;
	private Engine currentEngine;
	private MusicSystem currenMusicSystem;
	public Car() {
		//by default car does not have music system
		description="BMW M5";
		onRoadPrice=3500000;
		currentEngine=new Engine();
		//Not initializing currentMusicSystem as this car does not have music system
	}
	public Car(String description, int onRoadPrice, Engine currentEngine, MusicSystem currenMusicSystem) {
		this.description = description;
		this.onRoadPrice = onRoadPrice;
		this.currentEngine = currentEngine;
		this.currenMusicSystem = currenMusicSystem;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	public Engine getCurrentEngine() {
		return currentEngine;
	}
	public void setCurrentEngine(Engine currentEngine) {
		this.currentEngine = currentEngine;
	}
	public MusicSystem getCurrenMusicSystem() {
		return currenMusicSystem;
	}
	public void setCurrenMusicSystem(MusicSystem currenMusicSystem) {
		this.currenMusicSystem = currenMusicSystem;
	}

}
