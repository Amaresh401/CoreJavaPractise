package Eps;

import java.util.StringJoiner;

public class joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Amaresh").add("Anuraag").add("Priya");
		System.out.println(joiner.toString());

		String totalString = joiner.toString();
		System.out.println(totalString);

	}

}