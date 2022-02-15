package Eps;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String withSpaces = " This is an IT industry ";
		String withOutSpaces = "";

		// First Approach
		System.out.println("*********First Approach*********");
		System.out.println(withSpaces.trim().replaceAll("\\s+", ""));

		// Second Approach
		System.out.println("*********Second Approach*********");
		for (int i = 0; i < withSpaces.length(); i++) {
			if (withSpaces.charAt(i) != ' ') {
				withOutSpaces = withOutSpaces + withSpaces.charAt(i);
			}
		}
		System.out.println(withOutSpaces);

		// Third Approach
		System.out.println("*********Third Approach*********");
		StringBuffer sb = new StringBuffer();
		String[] splitString = withSpaces.trim().split(" ");

		for (String string : splitString) {
			sb.append(string);
		}
		System.out.println(sb);

	}

}
