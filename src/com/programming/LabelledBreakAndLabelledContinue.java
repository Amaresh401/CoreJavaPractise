package com.programming;

public class LabelledBreakAndLabelledContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xyz: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 3 & j == 3) {
					break xyz;
				}
				System.out.println(i + " " + j);
			}
			System.out.println();
		}
	}
}
