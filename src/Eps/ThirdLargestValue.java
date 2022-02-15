package Eps;

public class ThirdLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 101, 20, 25, 63, 96, 105 };

		int sortarr[] = sortedArray(arr);
		
		for (int i = 0; i < sortarr.length; i++) {
			System.out.print(sortarr[i]+" ");
		}
		System.out.println();

		System.out.println(sortarr[sortarr.length - 3]);

	}

	private static int[] sortedArray(int arr[]) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

}
