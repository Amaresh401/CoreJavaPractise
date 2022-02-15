package com.programming;

public class WithInThePackageClass extends InternalClass{

	public int a = 30;
	
	public  void m(){
		System.out.println(27);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("Program accessing from Internal Package");
		InternalClass abc = new InternalClass();
		abc.m();*/
		
		InternalClass w= new WithInThePackageClass();
		w.m();
		System.out.println(w.a);

	}

}