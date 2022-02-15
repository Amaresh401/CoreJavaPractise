package Eps;

import java.io.UnsupportedEncodingException;

public class CalculateStringLengthWithoutLengthMethod {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String str = "Amaresh";

		// First Approach using length
		System.out.println(str.toCharArray().length);

		// Second Approach using split
		String splitStr[] = str.split("");
		System.out.println(splitStr.length);

		// Third Approach using count
		char[] ch = str.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		System.out.println(count);

		// Fourth Approach using bytes
		int strLengthUsingBytes = (str.getBytes("UTF-16BE").length) / 2;
		System.out.println(strLengthUsingBytes);

		int strLengthUsingBytes32 = (str.getBytes("UTF-8").length);
		System.out.println(strLengthUsingBytes32);

	}

}
