package Eps;

public class CheckingBinaryNumber {

	public static void main(String[] args) {

		// First approach using strings
		String number = "0010";

		boolean binary = isBinaryUsingStrings(number);
		if (binary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}

		// Second approach using integers
		int numbers = 0010;
		boolean binaryIntegers = isBinaryUsingIntegers(numbers);
		if (binaryIntegers) {
			System.out.println(numbers + " is a binary number");
		} else {
			System.out.println(numbers + " is not a binary number");
		}

	}

	private static boolean isBinaryUsingIntegers(int numbers) {
		// TODO Auto-generated method stub

		while (numbers != 0) {
			if ( numbers % 10 > 1) {
				return false;
			}else{
				numbers = numbers /10;
			}
		}
		return true;
	}

	private static boolean isBinaryUsingStrings(String str) {
		// TODO Auto-generated method stub

		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == '0' || str.charAt(i) == '1')) {
				return false;
			}
		}

		return true;
	}
}
