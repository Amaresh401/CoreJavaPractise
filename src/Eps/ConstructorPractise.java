package Eps;

public class ConstructorPractise {
	
	ConstructorPractise(){
		System.out.println("ConstructorPractise");
	}
	
	public static void ConstructorPractiseMain(){
		ConstructorPractise cp2=new ConstructorPractise();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		
		ConstructorPractise1.ConstructorPractise1main();

	}

}

class ConstructorPractise1{
	
	
	
	// Will execute after object creation.
	// But order of preference is first.
	{
		System.out.println("Instance Initializer Block");
	}
	
	static{
		System.out.println("Static");
	}
	
	private ConstructorPractise1(){
		System.out.println("ConstructorPractise1");
	}
	
	public static void ConstructorPractise1main(){
		ConstructorPractise1 cp1= new ConstructorPractise1();
	}
}
