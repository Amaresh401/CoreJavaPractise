package Eps;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Amaresh is a good coder";
		String strLowercase = str1.toLowerCase();
		char[] ch = strLowercase.toCharArray();
		int count = 0;

		// 1. Direct approach
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println("Vowels Count " + count);

		// 2. Optimized approach
		String str2 = "Amaresh is a good coder";
		int optApproachCount = 0;

		for (int i = 0; i < str2.length(); i++) {
			if (vowels(str2.charAt(i))) {
				optApproachCount++;
			}
		}
		System.out.println("Optimized Approach Count " + optApproachCount);

		// 3. Java 8 Streams

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int c) {
				return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U';
			}
		};

		String str3 = "Amaresh is a good coder";
		long vowelCountWithJavaStreams = str3.chars().filter(vowel).count();
		System.out.println("Vowel Count With Java Streams " + vowelCountWithJavaStreams);

		// 4. Using Google Guava
		String str4 = "Amaresh is a good coder";
		int googleGuavaValue = CharMatcher.anyOf("aeiouAEIOU").countIn(str4);
		System.out.println("Vowel Count using Google Guava Value " + googleGuavaValue);

		// java stream practise duplicate values
		IntPredicate vowels1 = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A'
						|| value == 'E' || value == 'I' || value == 'O' || value == 'U';
			}
		};
		
		String str7 = "myfrieds are liking me";
		long friend = str7.chars().filter(vowels1).count();
		System.out.println(friend);
		
		int charValue = CharMatcher.anyOf("aeiouAEIOU").countIn(str7);
		System.out.println(charValue);

	}

	public static boolean vowels(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';

	}

}
