package iterationExercises;

public class taxes {
	public static void main(String[] args) {
		System.out.println(tax1(25000));
		System.out.println(tax2(25000));
	}

	private static double tax2(double i) {
		// TODO Auto-generated method stub
		double taxpercent = tax1(i);
		return i * taxpercent/100;
	}

	private static double tax1(double i) {
		// TODO Auto-generated method stub
		if ( i < 15000 ) {
			return (0);
		}
		if ( i < 20000 ) {
			return (10);
		}
		if ( i < 30000 ) {
			return (15);
		}
		if ( i < 45000 ) {
			return (20);
		} else {
			return (25);
		}
		
	}
}
