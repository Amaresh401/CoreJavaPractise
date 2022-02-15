package LearningExceptions;

public class FinallyKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a());
		b();
	}
	
	static int a(){
		try{
			return 1;
		}finally{
			System.out.println("Final code is executed");
		}
	}
	
	static void b(){
		throw new ArithmeticException("doesn't matter");
	}

}
