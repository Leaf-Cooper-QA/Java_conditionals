package iterationExercises;

public class fizzBuzz {
	public static void main(String[] args) {
		fizzbuzz(21);
		fizzbuzz(15);
		fizzbuzz(25);
		fizzbuzz(401);
	}

	private static void fizzbuzz(int i) {
		// TODO Auto-generated method stub
		if (i%3 == 0) {
			if (i%5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println("Fizz");
			}
		} else {
			if (i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
