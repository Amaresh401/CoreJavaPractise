package Eps;

public class RemovingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{Welcome to {Company}";
		
		char openCurly='{';
		char closedCurly='}';
		
		String noBracesString = removingBraces(s,openCurly,closedCurly);
		System.out.println(noBracesString);

	}

	private static String removingBraces(String s, char openCurly, char closedCurly) {
		// TODO Auto-generated method stub
		
		int read=0;
		int write=0;
		char ch[]=s.toLowerCase().toCharArray();
				
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=openCurly && ch[i]!=closedCurly){
				ch[write]=ch[read];
				write++;
			}
			read++;
		}
		
		int noOfBraces=ch.length-write;
		
		String newOne = "";
		for (int i = 0; i < ch.length-noOfBraces; i++) {
			newOne=newOne+ch[i];
		}
		
		
		
		return newOne;
	}

}
