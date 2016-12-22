
public class ProteinTrackerTestDrive {

	public static void main(String[] args) throws InvalidGoalException {
		// TODO Auto-generated method stub
		
		TrackingService jai = new TrackingService();
		
		jai.setGoal(500);
		
		jai.addProtein(100);
		jai.removeProtein(50);
		jai.addProtein(75);
		jai.removeProtein(30);
		jai.addProtein(80);
		jai.removeProtein(20);
		jai.addProtein(250);
		jai.removeProtein(150);
		jai.addProtein(200);
		jai.removeProtein(20);
		
		System.out.println(jai.getHistory());
		
		System.out.println("Has Goal Met?" + jai.isGoalMet());

	}

}
