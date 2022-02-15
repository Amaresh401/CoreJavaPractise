package Eps;

public class userRegistrationPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aQwFdA";

		char[] individualCharacters = input.toCharArray();
		int count = 0;

		if (individualCharacters[0] >= 'a' && individualCharacters[0] <= 'z') {

			for (int i = 0; i < individualCharacters.length; i++) {
				if (i % 2 == 0) {
					if (individualCharacters[i] >= 'a' && individualCharacters[i] <= 'z') {
						count++;
					} else {
						break;
					}
				} else {
					if (individualCharacters[i] >= 'A' && individualCharacters[i] <= 'Z') {
						count++;
					} else {
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < individualCharacters.length; i++) {
				if (i % 2 == 0) {
					if (individualCharacters[i] >= 'A' && individualCharacters[i] <= 'Z') {
						count++;
					} else {
						break;
					}
				} else {
					if (individualCharacters[i] >= 'a' && individualCharacters[i] <= 'z') {
						count++;
					} else {
						break;
					}
				}
			}
		}

		if (count == individualCharacters.length) {
			System.out.println("True");
			System.out.println(count);
		} else {
			System.out.println("False");
			System.out.println(count);
		}

	}

}
