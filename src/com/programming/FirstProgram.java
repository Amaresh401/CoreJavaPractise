package com.programming;

public class FirstProgram {

	String name;
	int age;
	String designation;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		FirstProgram F = new FirstProgram();
		F.setAge(25);
		System.out.println(F.getAge());
	}
}
