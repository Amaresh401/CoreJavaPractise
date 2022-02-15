package Eps;

import java.util.Arrays;
import java.util.HashMap;

public class DupCharInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "initerviewi";

		duplicateCharacters(s);

		duplicateCharactersOptimization(s);

		/*
		 * HashMap<Character, Integer> characters =
		 * duplicateCharCountInString(s); for (Character ch:
		 * characters.keySet()) { if(characters.get(ch)>1){
		 * System.out.println(ch +" "+ characters.get(ch)); } }
		 */
	}

	private static HashMap<Character, Integer> duplicateCharCountInString(String s) {
		// TODO Auto-generated method stub

		char[] ch = s.toLowerCase().toCharArray();
		HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (characters.containsKey(ch[i])) {
				characters.put(ch[i], characters.get(ch[i]) + 1);
			} else {
				characters.put(ch[i], count);
			}
		}
		return characters;
	}

	private static void duplicateCharactersOptimization(String s) {

		char ch[] = s.toLowerCase().toCharArray();
		Arrays.sort(ch);
		int flag = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				if (flag == 0) {
					System.out.println(ch[i]);
					flag = 1;
				}
			} else {
				flag = 0;
			}
		}
	}

	private static void duplicateCharacters(String s) {
		// TODO Auto-generated method stub
		char[] ch = s.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(ch[i]);
			}
		}
	}

}
