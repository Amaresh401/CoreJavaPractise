package Eps;

public class StarPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		int alphabetValue = 'A';
		// trianglePattern(value);
		// invertedTrianglePattern(value);
		// invertedTriangleTransposePattern(value);
		// pyramidPattern(value);
		// alphabeticPattern(alphabetValue, value);

	}

	private static void alphabeticPattern(int alphabetValue, int value) {
		// TODO Auto-generated method stub

		for (int i = alphabetValue; i < (alphabetValue + value); i++) {
			for (int j = alphabetValue; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}

	}

	private static void pyramidPattern(int value) {
		// TODO Auto-generated method stub

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void invertedTriangleTransposePattern(int value) {
		// TODO Auto-generated method stub

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void invertedTrianglePattern(int value) {
		// TODO Auto-generated method stub
		// System.out.println("Inverted Triangle");
		for (int i = 0; i < value; i++) {
			for (int j = value - i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void trianglePattern(int value) {
		// TODO Auto-generated method stub

		for (int i = 0; i < value; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
