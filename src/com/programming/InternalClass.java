package com.programming;

public class InternalClass {

	public int a = 10;

	protected  void m() {
		System.out.println(17);
	}
	
	public InternalClass(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program accessing from class");
		InternalClass abc = new InternalClass();
		abc.m();

	}

}