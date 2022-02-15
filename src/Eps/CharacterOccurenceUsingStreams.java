package Eps;

public class CharacterOccurenceUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Count of character occurences using streams";

		// Direct apporach
		long Count = str.chars().filter(e -> (char) e == 'c' || (char) e == 'C').count();
		System.out.println(Count);

		// Using as utility
		long value1 = getCharCount(str, 'c');
		System.out.println(value1);

		// Using as utility with method overloading
		long value2 = getCharCount(str, 'c', 'C');
		System.out.println(value2);
	}

	public static long getCharCount(String str, char c) {
		long Count = str.chars().filter(e -> (char) e == 'c').count();
		return Count;
	}

	public static long getCharCount(String str, char c, char d) {
		long Count = str.chars().filter(e -> (char) e == c || (char) e == d).count();
		return Count;
	}

}
