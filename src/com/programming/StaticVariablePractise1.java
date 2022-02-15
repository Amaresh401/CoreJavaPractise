package com.programming;

public class StaticVariablePractise1 {

	String studentName;
	int age;
	static String college = "IIT";

	StaticVariablePractise1(String studentName, int age) {
		this.studentName = studentName;
		this.age = age;
	}

	void display() {
		System.out.println(studentName + " " + age + " " + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariablePractise1 SVP1 = new StaticVariablePractise1("Amaresh", 28);
	
		SVP1.display();
	}

}
