package NewLearning;

public class MoveNegativeValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 1, -2, 9, -4, 5, -6, 3, -8, 7 };

		int arr[] = { 1, 9, 5, 3, 7 ,- 2, -4, -6, -8 };

		int finalArray[] = moveNegativeValues(arr);
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}

	}

	private static int[] moveNegativeValues(int[] arr) {
		// TODO Auto-generated method stub

		int[] arr2 = new int[arr.length];
		int j = arr2.length - 1;
		int k = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr[i] > 0) {
				arr2[j] = arr[i];
				j--;
			} else {
				arr2[k] = arr[i];
				k++;
			}
		}

		return arr2;

	}

}
