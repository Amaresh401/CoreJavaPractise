package Eps;

public class occurencesofacharacterUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amaresh is a good coder";
		
		long value = str.chars().filter(e -> (char)e == 'o').count();
		System.out.println(value);
		
		System.out.println(filterWithMultipleValues(str,'d','o'));

	}

	private static long filterWithMultipleValues(String str, char c, char d) {
		// TODO Auto-generated method stub
		return str.chars().filter(e -> (char)e == c || (char)e==d).count();
		
	}

}
