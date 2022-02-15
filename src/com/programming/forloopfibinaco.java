package com.programming;

public class forloopfibinaco {

	static int a=1;
	static int b=1;
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for(int i =0;i<10;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}*/
		System.out.print(b+" ");
		recurssion(10);
	}

	public static void recurssion(int i) {
	
		if(i>0){
		// TODO Auto-generated method stub
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		
		recurssion(i-1);
	}
	}
}
