package com.programming;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<6;i++){
			if(i==3){
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("--------");
		
		for(int i=0;i<6;i++){
			if(i==3){
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
