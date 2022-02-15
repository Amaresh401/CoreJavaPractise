package AutomationReinvented.Programs;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 145, 22, 63, 84, 52, 16 };

		// First Approach -- Not a good approach
		int secondElement = secondLargestElement(arr);
		System.out.println(secondElement);

		// Second Approach -- Best Approach
		int secondElementUsingSorting = secondElementUsingSorting(arr);
		System.out.println(secondElementUsingSorting);

	}

	private static int secondElementUsingSorting(int[] arr) {
		// TODO Auto-generated method stub

		int arrayLength = arr.length;
		int temp;
		for (int i = 0; i < arrayLength - 1; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[arrayLength - 2];
	}

	private static int secondLargestElement(int[] arr) {
		// TODO Auto-generated method stub

		int arrayLength = arr.length;
		int firstElement = 0;
		int secondElement = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (arr[i] > firstElement) {
				secondElement = firstElement;
				firstElement = arr[i];
			}
		}
		return secondElement;
	}

}
