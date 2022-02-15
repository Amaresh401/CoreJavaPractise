package Eps;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1='A';
		char ch2='B';
		
		int value='C';
		
		int asciiValue = ch1;
		
		System.out.println(asciiValue);
		System.out.println(+ch2);
		/*System.out.println(+ch1);
		System.out.println(value);*/
		
		
		/*Scanner s= new Scanner(System.in);
		char ch4= s.next().charAt(0);*/
		
		for (int i = 'A'; i < 'z'; i++) {
			System.out.println(i +" "+ +i +" ");
		}

	}

}
