package inheritance.Overiding;

public class Training {
	private String moduleName;
	private int duration;
	public Training() {
		moduleName="Core java";
		duration=30;
	}
	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	public void conduct() {
		
	}
	public String getDetails() {
		String details=moduleName+" "+duration;
		return details;
	}
}
