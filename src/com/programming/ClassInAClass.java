package com.programming;

class class1 {
	static int add(int first, int second) {
		return first + second;
	}

	static int add(int first, int second, int thrid) {
		return first + second;
	}
}

public class ClassInAClass extends class1 {

	static int add(int first, int second) {
		return first - second;
	}

	public static void main(String[] args) {
		class1 c = new class1();
		int result = c.add(4, 7);
		System.out.println(result);

		result = c.add(7, 7);
		System.out.println(result);

		result = add(4, 7);
		System.out.println(result);
	}
}