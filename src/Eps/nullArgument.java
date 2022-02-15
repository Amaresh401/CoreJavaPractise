package Eps;

public class nullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj(null);
		
		// Child object is the highest priority.

	}
	
	private static void obj(Object o){
		System.out.println("Object Argument");
	}
	
	private static void obj(String s){
		System.out.println("String Argument");
	}

}
