package com.programming;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char Value = 'b';
		

		grade('B');
		grade('B');

	}

	public static void grade(char Value) {
		switch (Value) {
		case 'A':
			System.out.println("You got 500 cash prize");
			break;

		case 'B':
			System.out.println("You got 1000 cash prize");
			break;
		}

	}

}
