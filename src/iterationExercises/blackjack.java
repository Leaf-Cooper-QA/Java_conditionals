package iterationExercises;

public class blackjack {
	public static void main(String[] args) {
		System.out.println(playblackjack(15,18));
		System.out.println(playblackjack(20,18));
		System.out.println(playblackjack(27,18));
		System.out.println(playblackjack(15,34));
		System.out.println(playblackjack(45243,1324));
	}

	private static int playblackjack(int i, int j) {
		// TODO Auto-generated method stub
		if (i > 21 && j > 21) {
			return 0;
		}
		if (i > 21) {
			return j;
		}
		if (j > 21) {
			return i;
		}
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}

}
