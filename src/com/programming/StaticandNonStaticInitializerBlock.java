package com.programming;

public class StaticandNonStaticInitializerBlock {

	static {
		System.out.println("Static Initializer block");
	}

	{
		System.out.println("Non Static Initializer block");
	}

	StaticandNonStaticInitializerBlock() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticandNonStaticInitializerBlock sb1 = new StaticandNonStaticInitializerBlock();
		StaticandNonStaticInitializerBlock sb2 = new StaticandNonStaticInitializerBlock();

		System.out.println("Main Method");
	}

}