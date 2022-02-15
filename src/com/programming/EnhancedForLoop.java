package com.programming;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		for(int i: arr){
			System.out.println(i);
		}
		
		String[] str={"Amaresh","Venkatesh","Rajesh"};
		for(String s: str){
			System.out.println(s);
		}
		
		int[][] doubleArr = {{1,2,3},{4,5,6}};
		for(int i = 0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(doubleArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("______");
		for(int[] a: doubleArr){
			for(int b:a){
				System.out.print(b +" ");
			}
			System.out.println();
		}

	}

}
