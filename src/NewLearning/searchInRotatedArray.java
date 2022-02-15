package NewLearning;

public class searchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 4, 5, 6, 7, 8, 1, 2 };
		int low = 0;
		int high = arr.length - 1;
		int searchValue = 33;
		int searchIndex = searchingInRotatedArray(arr, searchValue, low, high);
		System.out.println(searchIndex);

	}

	private static int searchingInRotatedArray(int[] arr, int searchValue, int low, int high) {

		if (low > high) {
			return -1;
		}

		int mid = low + ((high - low) / 2);

		if (arr[mid] == searchValue) {
			return mid;
		}
		if (arr[low] <= searchValue && searchValue <= arr[mid] && arr[low] <= arr[mid]) {
			return searchingInRotatedArray(arr, searchValue, low, mid - 1);
		} else if (arr[mid] <= searchValue && searchValue <= arr[high] && arr[mid] <= arr[high]) {
			return searchingInRotatedArray(arr, searchValue, mid + 1, high);
		} else if (arr[high] < arr[mid]) {
			return searchingInRotatedArray(arr, searchValue, mid + 1, high);
		} else if (arr[low] > arr[mid]) {
			return searchingInRotatedArray(arr, searchValue, low, mid - 1);
		}

		return -1;
	}
}