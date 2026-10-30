package inheritance.Overiding;

public class OnlineTraining extends Training {
	private String meetingLink;
	
	public OnlineTraining() {
		meetingLink="https://yccait.org/index.php/gallary";
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	// this is replacement ,overriden method completly replaces fuctionality of base class method
	public void conduct() {
		String currentModule=getModuleName();
		int currentDuration=getDuration();
		System.out.print("conducting on current module on: "+currentModule);
		System.out.print("  for "+currentDuration);
		System.out.print(" Using the link : "+meetingLink);
		System.out.println();
	}
	
	// this is Extension , overriden method  extends fuctionality of base class method 
	public String getDetails() {
		
		return super.getDetails()+" "+meetingLink;
	}
	

}
