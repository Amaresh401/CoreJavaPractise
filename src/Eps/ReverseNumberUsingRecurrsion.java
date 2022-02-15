package Eps;

public class ReverseNumberUsingRecurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 105;

		// First approach using recurrsion
		reverseUsingRecurrsion(number);

		System.out.println("");
		System.out.println("******");
		// Second approach without recurssion
		reverse(number);

	}

	private static void reverseUsingRecurrsion(int number) {
		// TODO Auto-generated method stub

		/*if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverse(number / 10);
		}*/
		
		System.out.print(number % 10);
		reverse(number / 10);

	}

	private static void reverse(int number) {
		// TODO Auto-generated method stub
		
		while(number>0){
			System.out.print(number%10);
			number = number/10;
		}

	}

}
