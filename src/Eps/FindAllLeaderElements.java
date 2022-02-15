package Eps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllLeaderElements {

	public static void main(String[] args) {
		int[] num = { 1, 52, 92, 7, 9, 12, 8, 3 };
		List<Integer> leaderElements = new ArrayList<Integer>();
		int numLength = num.length - 1;
		int highest = num[numLength];
		leaderElements.add(num[numLength]);
		for (int i = numLength; i >= 0; i--) {
			if (num[i] > highest) {
				leaderElements.add(num[i]);
				highest = num[i];
			}
		}

		for (int i = 0; i < leaderElements.size(); i++) {
			System.out.print(leaderElements.get(i) + " ");
		}

	}

}
