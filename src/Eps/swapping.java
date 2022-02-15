package Eps;

import java.util.Arrays;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 4, 5, 2 };

		int size = a.length - 1;
		int read = 0, write = 0;

		System.out.println(size);

		for (int i = 0; i <= size; i++) {

			if (a[read] != size) {
				a[write] = a[read];
				write++;
				read++;
			} else {
				read++;
			}
		}

		a[size] = size;

		System.out.println(Arrays.toString(a));

	}

}
