package com.programming;

public class ConstructorExample1 {
	
	int employeeId;
	String employeeName;
	
	

	ConstructorExample1(){
		employeeId=10;
		employeeName="Amaresh";
	}
	
	ConstructorExample1(int employeeId, String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample1 c=new ConstructorExample1();
		System.out.println(c.employeeId);
		System.out.println(c.employeeName);
		
		System.out.println("--------");
		
		ConstructorExample1 c2=new ConstructorExample1(1,"Venkatesh");
		System.out.println(c2.employeeId);
		System.out.println(c2.employeeName);

	}

}
