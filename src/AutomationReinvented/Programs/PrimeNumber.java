package AutomationReinvented.Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 121;

		boolean isPrimeNumber = isPrimeNumber(number);
		System.out.println(isPrimeNumber);

	}

	private static boolean isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		int loopTill = number/2;
		for (int i = 2; i < loopTill; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
