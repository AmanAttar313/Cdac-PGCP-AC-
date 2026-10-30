package HasARelationship;

public class Engine {
	private String power;
	private String fuel;
	
	public Engine() {
		power="2000CC";
		fuel="Rokel";
	}

	public Engine(String power, String fuel) {
		super();
		this.power = power;
		this.fuel = fuel;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	

}
