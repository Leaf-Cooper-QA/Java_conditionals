package iterationExercises;

public class Calculator2 {
	public static void main(String[] args) {
		division(5,4);
		division(3,4);
	}
	
	private static void division(double i, double j) {
		// TODO Auto-generated method stub
		if (i > j) {
			System.out.println(i/j);
		} else {
			System.out.println("division cannot be performed");
		}
		
	}
}
