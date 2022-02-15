package com.programming;

class Bank {
	int rateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int rateOfInterest() {
		return 7;
	}
}

class ICICI extends Bank {
	int rateOfInterest() {
		return 8;
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s.rateOfInterest());
	}
}
