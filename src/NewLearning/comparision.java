package NewLearning;

public class comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int[] arr3 = { 1, 2, 3, 4, 5, 6 };
		
		int commonValue = comparisionArray(arr1,arr2,arr3);
		System.out.println(commonValue);

	

	}

	private static int comparisionArray(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		int p1 = 0, p2 = 0, p3 = 0;

		while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
			
			if((arr1[p1] == arr2[p2]) && (arr1[p1] == arr3[p3]) ){
				return arr1[p1];
			}
			
			if(arr1[p1]<=arr2[p2] && arr1[p1]<=arr3[p3]){
				p1=p1+1;
			}else if (arr2[p2]<=arr3[p3] && arr2[p2]<=arr1[p1]){
				p2=p2+1;
			}else if(arr3[p3]<=arr1[p1] && arr3[p3]<=arr2[p2]){
				p3=p3+1;
			}

		}
		
		return -1;
		
	}

}
