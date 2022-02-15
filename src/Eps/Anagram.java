package Eps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstString = "geeksforgeeks";
		String secondString = "forgeeksgeeks";

		boolean isAnagramString = isAnagram(firstString, secondString);
		if(isAnagramString){
			System.out.println("Given strings are anagrams");
		}else{
			System.out.println("Given strings are not anagrams");
		}

	}

	private static boolean isAnagram(String firstString, String secondString) {
		// TODO Auto-generated method stub

		if (firstString.replaceAll("\\s+", "").length() == secondString.replaceAll("\\s+", "").length()) {

			char ch1[] = firstString.replaceAll("\\s+", "").toCharArray();
			char ch2[] = secondString.replaceAll("\\s+", "").toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);

		} else {
			return false;
		}

	}

}
