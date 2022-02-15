package Eps;

import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int matrixRow = sc.nextInt();
		int matrixCol = sc.nextInt();
		int[][] matrix = new int[matrixRow][matrixCol];
		
		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
		
		System.out.println("********Matrix*********");
		
		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********Transposed Matrix*********");
		
		for (int i = 0; i < matrixCol; i++) {
			for (int j = 0; j < matrixRow; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}

	}

}
