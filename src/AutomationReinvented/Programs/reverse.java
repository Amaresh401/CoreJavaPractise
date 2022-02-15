package AutomationReinvented.Programs;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amaresh";
		String rev = reverse(str);
		System.out.println(rev);
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		
		String rev="";
		int arrayLength = str.length();
		for (int i = arrayLength-1; i >= 0; i--) {
			rev = rev+str.charAt(i);
		}
		
		return rev;
	}

}
