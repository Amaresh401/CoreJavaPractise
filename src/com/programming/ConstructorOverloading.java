package com.programming;

public class ConstructorOverloading {

	int age;
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	ConstructorOverloading(){
		age=10;
	}
	
	ConstructorOverloading(int x){
		age=x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading CO1=new ConstructorOverloading();
		System.out.println(CO1.getAge());
		ConstructorOverloading CO2=new ConstructorOverloading();
		CO2.setAge(200);
		System.out.println(CO2.getAge());
	}
}