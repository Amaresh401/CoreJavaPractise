package NewLearning;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int value=3;
		int low=0;
		int high=arr.length-1;
		int valueIndex=valueOfIndex(arr,value,low,high);
		System.out.println("Index location is at "+valueIndex);

	}

	private static int valueOfIndex(int[] arr, int value, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low>high){
			return -1;
		}
		
		int mid = low+((high-low)/2);
		
		if(value==arr[mid]){
			return mid;
		}else if (value<arr[mid]){
			return valueOfIndex(arr, value, low, mid-1);
		}else{
			return valueOfIndex(arr, value, mid+1, high);
		}
		
	}

}
