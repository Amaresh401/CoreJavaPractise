package NewLearning;

public class MovingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 0, 7, 8, 0, 9 };
		int arr2[] = { 1, 2, 3, 4, 0, 7, 8, 0, 9 };
		int value = 0;
		
		int zerosStartingArray[] = orderingLeftZeros(arr, value);

		for (int i = 0; i < zerosStartingArray.length; i++) {
			System.out.print(zerosStartingArray[i] + " ");
		}

		System.out.println();

		int zerosEndingArray[] = orderingRightZeros(arr2, value);
		for (int i = 0; i < zerosEndingArray.length; i++) {
			System.out.print(zerosEndingArray[i] + " ");
		}

	}

	private static int[] orderingRightZeros(int[] arr2, int value) {
		// TODO Auto-generated method stub
		int read = 0;
		int write = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[read] != 0) {
				arr2[write] = arr2[read];
				write++;
			}
			read++;

		}

		while (write < arr2.length) {
			arr2[write] = value;
			write++;
		}

		return arr2;
	}

	private static int[] orderingLeftZeros(int[] arr, int value) {

		int read = arr.length - 1;
		int write = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[read] != 0) {
				arr[write] = arr[read];
				write--;
			}
			read--;
		}

		while (write >= 0) {
			arr[write] = value;
			write--;
		}

		return arr;

	}

}
