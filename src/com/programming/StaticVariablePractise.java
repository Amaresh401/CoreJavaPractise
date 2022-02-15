package com.programming;

public class StaticVariablePractise {

	static int count;

	StaticVariablePractise() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariablePractise SVP1 = new StaticVariablePractise();
		System.out.println(SVP1.count);

		StaticVariablePractise SVP2 = new StaticVariablePractise();
		System.out.println(SVP2.count);

		System.out.println(count);

	}

}