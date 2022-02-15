package Eps;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] elements = {1,0,1,0,1,0};

		// First Approach without using new array
		int[] shiftedElements = shiftZeroToRight(elements);
		for (int i = 0; i < shiftedElements.length; i++) {
			System.out.print(shiftedElements[i] + ",");
		}

		System.out.println();
		// Second Apporach using new array
		System.out.println("**************");

		int[] shiftedElementsUsingNewArray = shiftZeroToRightUsingNewArray(elements);
		System.out.println(Arrays.toString(shiftedElementsUsingNewArray));
		Arrays.sort(shiftedElementsUsingNewArray);

	}

	private static int[] shiftZeroToRightUsingNewArray(int[] elements) {
		// TODO Auto-generated method stub

		if (elements.length < 1) {
			return elements;
		}

		int[] duplicateElements = new int[elements.length];
		int count = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != 0) {
				duplicateElements[count] = elements[i];
				count++;
			}
		}

		return duplicateElements;
	}

	private static int[] shiftZeroToRight(int[] elements) {
		// TODO Auto-generated method stub

		int elementsLength = elements.length;
		int read = 0;
		int write = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[read] != 0) {
				elements[write] = elements[read];
				write++;
			}
			read++;
		}

		for (int i = write; i < elements.length; i++) {
			elements[i] = 0;
		}
		return elements;

	}

}
