package Eps;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = 54748;
		long number1Copy = number;
		long number1Copies = number;
		long count = 0;
		long armNumber = 0;

		while (number != 0) {
			count++;
			number = number / 10;
		}

		// System.out.println(count);

		for (int i = 0; i < count; i++) {
			long reminder = number1Copy % 10;
			armNumber = (long) (armNumber + Math.pow(reminder, count));
			number1Copy = number1Copy/10;
		}

		if (number1Copies == armNumber) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}

		// Second Approach
		long armNumber2 = 0;
		long number2 = 54748;
		long number2Copy = number2;
		for (int i = 0; i < count; i++) {
			long reminder = number2 % 10;
			long mathPowerProduct = 1;
			for (int j = 0; j < count; j++) {
				mathPowerProduct = mathPowerProduct * reminder;
			}
			number2 = number2 / 10;
			armNumber2 = (long) (armNumber2 + mathPowerProduct);
		}
		if (number2Copy == armNumber2) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}

	}

}
