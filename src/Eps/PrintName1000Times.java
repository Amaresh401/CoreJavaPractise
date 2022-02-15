package Eps;

public class PrintName1000Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String toPrintName = "Amaresh ";
		String initialName = "..........";
		
		String replacedInitialName1 = initialName.replace(".", "..........");
		String replacedInitialName2 = replacedInitialName1.replace(".", "..........");
		String print1000Times = replacedInitialName2.replaceAll(".", toPrintName);
		
		System.out.println(print1000Times);

	}

}
