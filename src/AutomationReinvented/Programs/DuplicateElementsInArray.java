package AutomationReinvented.Programs;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 145, 22, 22, 22, 145, 84, 84, 145, 22 };
		// duplicateElementUsingLoops(arr);
		// duplicateElementUsingSets(arr);
		duplicateElementUsingSortingAndFlags(arr);

	}

	private static void duplicateElementUsingSortingAndFlags(int[] arr) {
		// TODO Auto-generated method stub
		int arrayLength = arr.length;
		int temp;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		int flag = 0;
		for (int i = 0; i < arrayLength - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				if (flag == 0) {
					System.out.println(arr[i]);
					flag = 1;
				}
			} else {
				flag = 0;
			}
		}

	}

	private static void duplicateElementUsingSets(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Using HashMaps");
		HashSet<Integer> set = new HashSet<Integer>();
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (arr[i] == arr[j]) {
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);
	}

	private static void duplicateElementUsingLoops(int[] arr) {
		// TODO Auto-generated method stub

		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < arrayLength; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}