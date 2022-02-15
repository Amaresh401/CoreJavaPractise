package Eps;

public class Print1to100WithoutUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		print1to100(i);

	}

	private static void print1to100(int i) {
		// TODO Auto-generated method stub

		if (i <= 10) {
			System.out.println(i);
			i++;
			print1to100(i);
		}

		//return;

	}

}