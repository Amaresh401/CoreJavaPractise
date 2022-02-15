package Eps;

import java.text.MessageFormat;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Amaresh is A good boy";
		char ch = 'A';
		characterOccurenceInaString(str, ch);

	}

	private static void characterOccurenceInaString(String str, char ch) {
		// TODO Auto-generated method stub

		if (str == null) {
			System.out.println("Null is not acceptable");
			return;
		}

		if (str.length() == 0) {
			System.out.println("Characters in a string should be greater than 0");
			return;
		}

		if (str.length() >= 1) {
			char[] ch2 = str.toCharArray();
			int count = 0;
			for (int i = 0; i < ch2.length; i++) {
				if (ch == ch2[i]) {
					count++;
				}
			}
			System.out
					.println(MessageFormat.format("Character {0} displaying {1} times in string: {2}", ch, count, str));
			System.out
			.printf("Character %s displaying %s times in string: %s", ch, count, str);
		}
	}

}
