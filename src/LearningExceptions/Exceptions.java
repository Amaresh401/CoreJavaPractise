package LearningExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Exceptions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a[] = new int[5];
		try{
		a[8]=10;
		}catch(IndexOutOfBoundsException I){
			I.printStackTrace();
		}
		System.out.println("Printed");
		*/
		
		Reader r= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String str=null;
		do{
		try {
			str= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
		}while(!str.equals("exit"));
	}

}
