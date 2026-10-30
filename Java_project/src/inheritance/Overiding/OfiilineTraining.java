package inheritance.Overiding;

public class OfiilineTraining extends Training {
		private String venue;
		
		public OfiilineTraining() {
			venue="YCP AIT";
		}

		public OfiilineTraining(String moduleName, int duration, String venue) {
			super(moduleName, duration);
			this.venue = venue;
		}

		public String getVenue() {
			return venue;
		}

		public void setVenue(String venue) {
			this.venue = venue;
		}
		// this is replacement , overridin method completly replaces fuctionality of base class method
		public void conduct() {
			String currentModule=getModuleName();
			int currentDuration=getDuration();
			System.out.print("conducting on current module on: "+currentModule);
			System.out.print("  for "+currentDuration);
			System.out.print(" at "+venue);
			System.out.println();
		}
		
		public String getDetails() {
			
			return super.getDetails()+" "+venue;
		}
}
