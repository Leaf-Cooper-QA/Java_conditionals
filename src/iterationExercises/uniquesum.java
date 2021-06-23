package iterationExercises;

public class uniquesum {
	public static void main(String[] args) {
		System.out.println(unique(3,4,5));
		System.out.println(unique(4,4,5));
	}

	private static int unique(int i, int j, int k) {
		// TODO Auto-generated method stub
		if ( i == j && j == k) {
			return 0;
		}
		if ( i == j ) {
			return k;
		}
		if ( k == j ) {
			return i;
		}
		if ( i == k ) {
			return j;
		}
		return (i + j + k);
	}

}
