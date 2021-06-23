package iterationExercises;

public class flowchart {
	public static void main(String[] args) {
		System.out.println(method1(3,4,true));
		method2(420);
		method2(4269);
	}

	private static void method2(int A) {
		if ( A <= 2000 ) {
			System.out.println("1");
			if ( A <= 100 ) {
				System.out.println("2");
			} else {
				System.out.println("3");
				if ( A > 600 ) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if ( A > 500 ) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			}
		} else {
			System.out.println("A");
			if ( A > 6000 ) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if ( A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}
	}

	private static int method1(int i, int j, boolean b) {
		if (b) {
			return (i + j);
		} else {
			return (i * j);
		}
		
	}

}
