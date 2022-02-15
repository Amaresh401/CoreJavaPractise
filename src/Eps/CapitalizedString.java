package Eps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "thisNaveenAutomationLabsYoutube";

		// 1
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		// 2
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count2++;
			}
		}
		System.out.println(count2);

		// 3
		int count3 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count3++;
			}
		}
		System.out.println(count3);

		// 4
		long count4 = str.chars().filter(e -> e >= 65 && e <= 90).count();
		System.out.println(count4);

		// 5
		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println(count5);

		// 6 Regular Expression
		String reg = "[A-Z]+";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		int count6 = 0;
		while (m.find()) {
			count6++;
		}
		System.out.println("Using Regular Expression " + count6);

		// New Interview Question with small letter starting in a string
		String str2 = " thisNaveenAutomationLabsYoutube";
		int count7 = 0;
		if (Character.isLowerCase(str2.trim().charAt(0))) {
			count7++;
		}
		for (char c : str2.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count7++;
			}
		}
		System.out.println("With small letter starting "+count7);
		

	}
}
