package AutomationReinvented.Programs;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstString = "spar";
		String secondString = "rasp";
		boolean isAnagram = anagram(firstString, secondString);
		if (isAnagram) {
			System.out.println("Given String are anagrams");
		}else{
			System.out.println("Given Strings are not anagrams");
		}

	}

	private static boolean anagram(String firstString, String secondString) {
		// TODO Auto-generated method stub

		int firstStringLength = firstString.trim().replace("\\s+", "").length();
		int secondStringLength = secondString.trim().replace("\\s+", "").length();

		if (firstStringLength == secondStringLength) {
			char[] firstStringCharacters = firstString.trim().replaceAll("\\s+", "").toCharArray();
			char[] secondStringCharacters = secondString.trim().replaceAll("\\s+", "").toCharArray();

			Arrays.sort(firstStringCharacters);
			Arrays.sort(secondStringCharacters);

			return Arrays.equals(firstStringCharacters, secondStringCharacters);

		} else {
			return false;
		}

	}

}
