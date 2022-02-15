package NewLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 2, 4 };
		int targetSum = 10;

		Arrays.sort(arr1);

		ArrayList<String> tripletValues = tripletCombinations(arr1, targetSum);
		if (tripletValues.size() > 0) {
			for (int i = 0; i < tripletValues.size(); i++) {
				System.out.println(tripletValues.get(i));
			}
		} else {
			System.out.println("No Match Found");
		}

	}

	private static ArrayList<String> tripletCombinations(int[] arr1, int targetSum) {
		// TODO Auto-generated method stub

		ArrayList<String> values = new ArrayList<String>();

		for (int i = 0; i < arr1.length - 2; i++) {

			int left = i + 1;
			int right = arr1.length - 1;

			while (left < right) {

				if ((arr1[i] + arr1[left] + arr1[right]) == targetSum) {

					values.add(arr1[i] + "," + arr1[left] + "," + arr1[right]);

					// System.out.println(arr1[i] + "," + arr1[left] + "," + arr1[right]);

					left = left + 1;
					right = right - 1;
				} else if ((arr1[i] + arr1[left] + arr1[right]) < targetSum) {
					left = left + 1;
				} else {
					right = right - 1;
				}

			}

		}

		return values;

	}

}
