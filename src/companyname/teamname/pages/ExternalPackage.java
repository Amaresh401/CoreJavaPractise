package companyname.teamname.pages;


import com.programming.InternalClass;

public class ExternalPackage extends InternalClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program accessing from External Package");
		/*InternalClass abcd = new InternalClass();
		abcd.m();*/
		
		ExternalPackage ep= new ExternalPackage();
		ep.m();
		
		InternalClass o= new InternalClass();
		// Throwing error as method is not static
		// o.m();

	}

}