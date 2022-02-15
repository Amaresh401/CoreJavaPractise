package Eps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "100";

		duplicateCharactersInString(str);

	}

	private static void duplicateCharactersInString(String str) {
		// TODO Auto-generated method stub

		if (str == null) {
			System.out.println("Null should not be accepted");
			return;
		}

		int strLength = str.length();

		if (strLength == 0) {
			System.out.println("Empty string doesn't have any duplicates");
			return;
		}

		if (strLength == 1) {
			System.out.println("Single character of a string doesn't have any duplicates");
			return;
		}

		if (strLength > 1) {
			char ch[] = str.toCharArray();
			HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

			for (int i = 0; i < ch.length; i++) {
				if (hs.containsKey(ch[i])) {
					hs.put(ch[i], hs.get(ch[i]) + 1);
				} else {
					hs.put(ch[i], 1);
				}
			}

			// Using keyset
			for (char c : hs.keySet()) {
				if (hs.get(c) > 1) {
					System.out.println("Character '" + c + "' count is " + hs.get(c));
					// return;
				}
			}

			// Using entrySet while loop
			Set s = hs.entrySet();
			Iterator<Map.Entry<Character, Integer>> i = s.iterator();
			while (i.hasNext()) {
				Map.Entry<Character, Integer> mp = i.next();
				System.out.println(mp.getKey() + " " + mp.getValue());
			}

			// Using entrySet for loop
			Set<Map.Entry<Character, Integer>> entryset = hs.entrySet();
			for (Entry<Character, Integer> entry : entryset) {
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey() + " count is " + entry.getValue());
				}
			}

		}

	}

}