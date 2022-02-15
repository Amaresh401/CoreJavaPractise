package Eps;

import java.util.Arrays;
import java.util.BitSet;

public class Print1to100WithoutLoopsAndRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] num = new Object[100];

		Arrays.fill(num, new Object() {
			int count = 0;

			public String toString() {
				return Integer.toString(++count);

			}
		});

		System.out.println(Arrays.toString(num));

		System.out.println();

		// Using Bitset
		String values = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(values, 1, values.length());

	}

}
