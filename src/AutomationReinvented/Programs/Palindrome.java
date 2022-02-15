package AutomationReinvented.Programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4545;
		int numduplicate = num;
		int reminder;
		int numreverse = 0;
		while (num > 0) {
			reminder = num % 10;
			numreverse = numreverse * 10 + reminder;
			num = num/10;
		}
		if(numduplicate == numreverse){
			System.out.println("Given number is palindrome");
		}else{
			System.out.println("Given number is not palindrome");
		}

	}

}