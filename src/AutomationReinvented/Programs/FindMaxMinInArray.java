package AutomationReinvented.Programs;

public class FindMaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 145, 22, 63, 84, 52, 16 };
		String maxAndMin = maxAndMin(arr);

		System.out.println(maxAndMin);
	}

	private static String maxAndMin(int[] arr) {
		// TODO Auto-generated method stub

		int highestValue = arr[0];
		int lowestValue = arr[0];
		int arrayLength = arr.length;

		for (int i = 0; i < arrayLength; i++) {

			if (arr[i] > highestValue) {
				highestValue = arr[i];
			}
			if (arr[i] < lowestValue) {
				lowestValue = arr[i];
			}
		}

		return highestValue + " and " + lowestValue;
	}

}
