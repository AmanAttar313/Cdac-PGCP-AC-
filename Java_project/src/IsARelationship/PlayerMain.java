package IsARelationship;

public class PlayerMain {
	public static void main(String[] args) {
		CricketPlayer crPlayer1=new CricketPlayer();
		crPlayer1.setName("AQSA");
		crPlayer1.setAge(101);
		crPlayer1.setRuns(150);
		crPlayer1.setBattingAvg(50.3f);
		
		System.out.println(crPlayer1.getName()+" "+crPlayer1.getRuns());
		
		CricketPlayer crPlayer2=new CricketPlayer("Dhoni",45,6000,90.6f);
		
	}
}
