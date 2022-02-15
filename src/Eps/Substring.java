package Eps;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Amaresh";
		String s2 = "mabr";

		// First Approach - Using Logic
		verifySubStringPresentorNot(s1, s2);

		// Second Approach - Using regular expressions
		verifyUseingRegularExpression(s1, s2);

		System.out.println(s1.matches("(.*)" + s2 + "(.*)"));

	}

	private static void verifyUseingRegularExpression(String s1, String s2) {
		System.out.println(s1.matches("(.*)" + s2 + "(.*)"));

	}

	private static void verifySubStringPresentorNot(String s1, String s2) {
		// TODO Auto-generated method stub

		if (s1 == null || s2 == null) {
			System.out.println("Null is not acceptable");
			return;
		}

		if (s1 == "" || s2 == "") {
			System.out.println("Empty strings are not acceptable");
			return;
		}

		if (s2.length() > s1.length()) {
			System.out.println("Substring length should not be more than string");
			return;
		}

		for (int i = 0; i < s1.length() - s2.length(); i++) {
			int count=0;
			for (int j = 0;j < s2.length(); j++) {
				if ((s1.charAt(i + j) == s2.charAt(j))) {
					count++;
					//break;
				}
			}
			if (count == s2.length()) {
				System.out.println("SubString Exits");
				return;
			}
		}
		System.out.println("Substring doesn't exists");

	}

}
