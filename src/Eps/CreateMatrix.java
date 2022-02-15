package Eps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;

public class CreateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in); int row = sc.nextInt(); int col
		 * = sc.nextInt();
		 * 
		 * Random random = new Random(); int[][] matrix1 = new int[row][col];
		 * int[][] matrix2 = new int[row][col];
		 * 
		 * createMatrix1(matrix1, row, col, random); createMatrix1(matrix2, row,
		 * col, random); addition(matrix1, matrix2, row, col);
		 */
		multiplication();

	}

	private static void multiplication() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row1Matrix = s.nextInt();
		int col1Matrix = s.nextInt();
		Random r = new Random();

		int[][] matrix1 = new int[row1Matrix][col1Matrix];
		for (int i = 0; i < row1Matrix; i++) {
			for (int j = 0; j < col1Matrix; j++) {
				// matrix1[i][j] = r.nextInt(100);
				matrix1[i][j] = s.nextInt();
			}
		}

		int row2Matrix = s.nextInt();
		int col2Matrix = s.nextInt();
		int[][] matrix2 = new int[row2Matrix][col2Matrix];
		for (int i = 0; i < row2Matrix; i++) {
			for (int j = 0; j < col2Matrix; j++) {
				// matrix2[i][j] = r.nextInt(100);
				matrix2[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < row1Matrix; i++) {
			for (int j = 0; j < col1Matrix; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < row2Matrix; i++) {
			for (int j = 0; j < col2Matrix; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		int[][] resultMatrix = new int[row1Matrix][col2Matrix];
		int[][] resultantMatrixValue = new int[row1Matrix][col2Matrix];

		if (col1Matrix == row2Matrix) {
			for (int i = 0; i < row1Matrix; i++) {
				for (int j = 0; j < col2Matrix; j++) {
					for (int k = 0; k < row2Matrix; k++) {
						resultantMatrixValue[i][j] = resultantMatrixValue[i][j] + matrix1[i][k] * matrix2[k][j];
					}
				}
			}

		} else {
			System.out.println("Matrix multiplication is not possible");
		}

		System.out.println("************");

		for (int i = 0; i < row1Matrix; i++) {
			for (int j = 0; j < col2Matrix; j++) {
				System.out.print(resultantMatrixValue[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void addition(int[][] matrix1, int[][] matrix2, int row, int col) {
		// TODO Auto-generated method stub

		int[][] matrixMultiplication = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixMultiplication[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		for (int[] is : matrixMultiplication) {
			System.out.println(Arrays.toString(is));
		}

	}

	private static void createMatrix1(int[][] matrix1, int row, int col, Random random) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = random.nextInt(100);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		/*
		 * for (int[] is : matrix1) { System.out.println(Arrays.toString(is)); }
		 */
	}
}