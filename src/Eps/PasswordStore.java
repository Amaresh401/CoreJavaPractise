package Eps;

import java.util.Arrays;

public class PasswordStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Password123";
		System.out.println("pwd is "+str);
		
		char[] c = {'p','a','s','s','w','o','r','d','1','2','3'};
		System.out.println(""+c);
		
		Arrays.fill(c, '*');
		System.out.println(c);

	}

}
