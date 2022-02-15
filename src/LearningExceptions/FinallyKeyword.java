package LearningExceptions;

import java.io.IOException;

public class FinallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int data=25/0;
			System.out.println(data);
		}catch(NullPointerException I){
			I.printStackTrace();
		}finally{
			System.out.println("Finally Code Executed");
		}
		
		System.out.println("Rest of the Code..");

	}

}
