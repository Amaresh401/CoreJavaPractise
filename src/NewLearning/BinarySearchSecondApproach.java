package NewLearning;

public class BinarySearchSecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {16};
		int low=0;
		int high = arr.length-1;
		int value= 16;
		int valueIndex = binarySearchIteration(arr, value, low, high);
		
		System.out.println("Index Position "+valueIndex);
	}

	private static int binarySearchIteration(int[] arr, int value, int low, int high) {
		
		while(high>=low){
			int mid=low+(high-low)/2;
			if(arr[mid]==value){
				return mid;
			}else if (value>arr[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		
		return -1;
	}

}
