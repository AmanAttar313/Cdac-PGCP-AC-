package inheritance.Overiding;

public class TrainingMain {
	public static void main(String[] args) {
		OfiilineTraining offline =new OfiilineTraining();
		offline.conduct();
		System.out.println("===================");
		OnlineTraining online = new OnlineTraining("SQL",30,"https://yccait.org/index.php/gallary");
		online.conduct();
		
		System.out.println("===================||||||||===========================");
		
		
		System.out.println(offline.getDetails());
		System.out.println(online.getDetails());
		
	}
}
