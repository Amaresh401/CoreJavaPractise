package Eps;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AverageArray {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = { 1, 2, 3, 4, 5, 3, 2, 3, 4 };

		// First Approach
		double average = average(number);
		System.out.println("Average is " + average);

		// Second Approach using streams
		OptionalDouble d = Arrays.stream(number).average();
		System.out.println("Getting average using streams " + d.getAsDouble());

		// Third Approach using Google Guava
		Double de = DoubleMath.mean(number);
		System.out.println("Average using Google Guava " + de);

	}

	private static double average(int[] number) {
		// TODO Auto-generated method stub

		double sum = 0;
		int length = number.length;

		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}

		return sum / length;
	}

}
