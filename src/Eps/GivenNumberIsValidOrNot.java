package Eps;

public class GivenNumberIsValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "123456";
		String phoneNumber = "-123456789";
		String creditCardNumber = "123456789123456a";

		// First approach
		validNumber(number);
		validPhoneNumber(phoneNumber);
		validCCPhoneNumber(creditCardNumber);

		// Second approach using regular expression
		System.out.println(regularExpression("123456789s"));

		// Third approach using other regular expression
		System.out.println(regularExpressionOtherMethod("123456789a"));

	}

	private static boolean regularExpressionOtherMethod(String string) {
		// TODO Auto-generated method stub
		return string.matches("\\d{10}");
	}

	private static boolean regularExpression(String string) {
		// TODO Auto-generated method stub
		return string.matches("[0-9]{10}");
	}

	private static boolean validCCPhoneNumber(String creditCardNumber) {
		// TODO Auto-generated method stub

		if (creditCardNumber.length() == 16 && validNumber(creditCardNumber)) {
			System.out.println("Given credit card number is valid");
			return true;
		}
		System.out.println("Given credit card number is not valid");
		return false;

	}

	private static boolean validPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub

		if (phoneNumber.length() == 10 && validNumber(phoneNumber)) {
			if (phoneNumber.charAt(0) == '-') {
				System.out.println("Given number is not a valid phone number");
				return false;
			}
			System.out.println("Given number is a phone number");
			return true;
		}
		System.out.println("Given number is not a valid phone number");
		return false;

	}

	private static boolean validNumber(String number) {
		// TODO Auto-generated method stub
		try {
			Long.parseLong(number);
			System.out.println("Given number is valid");
		} catch (NumberFormatException e) {
			System.out.println("Given number is not valid");
			return false;
		}
		return true;

	}

}
