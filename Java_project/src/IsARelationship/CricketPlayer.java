package IsARelationship;

public class CricketPlayer extends Player {
	private int runs;
	private float battingAvg;
	
	public CricketPlayer() {
		//super(); this call implicit means by default by java
		System.out.println("Inside CricketPlayer()");
	}
	
	public CricketPlayer(String nm,int ag,int rn,float ba) {
//		super(nm,ag); // this recommneded getting name and 
		//age from parent class player into cricket player class
		
		runs=rn;
		battingAvg=ba;
		
		//setName(nm); this works but not recommended
		
		
	}
	
	

	public CricketPlayer(int age, String name, int runs, float battingAvg) {
		super(age, name);
		this.runs = runs;
		this.battingAvg = battingAvg;
	}

	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
	
	
}
