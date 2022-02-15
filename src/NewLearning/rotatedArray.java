package NewLearning;

public class rotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={7,8,9,1,2};
		int low=0;
		int high=arr.length-1;
		int indexValue = rotatedArray(arr,low,high);
		System.out.println(indexValue);

	}

	private static int rotatedArray(int[] arr, int low, int high) {
		
		int mid = low + ((high-low)/2);
		
		if(arr[mid]>arr[mid+1]){
			return mid+1;
		}
		if(arr[mid]<arr[mid-1]){
			return mid;
		}
		
		if(arr[high]>arr[mid]){
			return rotatedArray(arr, low, mid-1);
		}else{
			return rotatedArray(arr, mid+1, high);
		}
		
	}

}