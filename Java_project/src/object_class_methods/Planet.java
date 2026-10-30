package object_class_methods;

import java.util.Objects;

public class Planet {
	private String name;
	private int moons;
	public Planet() {
		name="Earth";
		moons=1;
	}
	public Planet(String name, int moons) {
	
		this.name = name;
		this.moons = moons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoons() {
		return moons;
	}
	public void setMoons(int moons) {
		this.moons = moons;
	}
	
	// toString method call automatically or implicitly
	@Override
	public String toString() { // giving by ecllipes 
		return "Planet [name=" + name + ", moons=" + moons + "]";
	}
	
	
//	@Override
//	public String toString() { //  manuallay/self made toString method overide in built toString method
//		return name + "," +moons;  
//	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(moons, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return moons == other.moons && Objects.equals(name, other.name);
	}
}
