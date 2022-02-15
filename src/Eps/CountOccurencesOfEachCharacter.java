package Eps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfEachCharacter {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Nekkalapudi Phaneendra Kumar";
		HashMap<Character, Integer> characterCount = countOfEachCharacter(str);

		if (str != null) {

			for (Character ch : characterCount.keySet()) {
				System.out.println(ch + " " + characterCount.get(ch));
			}

			System.out.println();
			System.out.println("************");
			for (Map.Entry<Character, Integer> ch2 : characterCount.entrySet()) {
				System.out.println(ch2.getKey() + " " + ch2.getValue());
			}

		}

	}

	private static HashMap<Character, Integer> countOfEachCharacter(String str) {
		// TODO Auto-generated method stub

		if (str == null) {
			System.out.println("Null is not acceptable");
			return null;
		}

		HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
		int givenStringLength = str.length();
		char[] characters = str.toCharArray();
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if ((characters[i] != ' ')) {

				if (characterCount.containsKey(characters[i])) {
					characterCount.put(characters[i], characterCount.get(characters[i]) + 1);
				} else {
					characterCount.put(characters[i], count);
				}
			}
		}
		return characterCount;
	}

}
