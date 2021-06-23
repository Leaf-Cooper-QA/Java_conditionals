package iterationExercises;

public class Exam2 {
	public static void main(String[] args) {
		int biologymark = 86;
		int chemistrymark = 87;
		int physicsmark = 90;
		
		displayscore(biologymark,chemistrymark,physicsmark);
		displaypercentage(biologymark,chemistrymark,physicsmark);
	}

	private static void displaypercentage(double biologymark, double chemistrymark, double physicsmark) {
		// TODO Auto-generated method stub
		double percentage = (biologymark+chemistrymark+physicsmark)*100/450;
		System.out.print("The overall percentage score is ");
		System.out.print(percentage);
		System.out.println("%");
		if (percentage < 60) {
			System.out.println("You have scored less than 60% and failed");
		}
	}

	private static void displayscore(double biologymark, double chemistrymark, double physicsmark) {
		// TODO Auto-generated method stub
		int fails = 0;
		System.out.print("The biology score is ");
		System.out.println(biologymark);
		if (biologymark/150 < 0.6) {
			fails++;
		}
		System.out.print("The chemistry score is ");
		System.out.println(chemistrymark);
		if (chemistrymark/150 < 0.6) {
			fails++;
		}
		System.out.print("The physics score is ");
		System.out.println(physicsmark);
		if (physicsmark/150 < 0.6) {
			fails++;
		}
		System.out.print("The total score is ");
		System.out.println(biologymark+chemistrymark+physicsmark);
		if (fails != 0) {
			System.out.println("Sorry, you failed with " + fails + " failed units");
		}
	}

}


