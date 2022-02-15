package Eps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		String infra[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Azure", "SauceLabs", "Azure", "GCP" };
		bruteForceApproach(infra);
		hashSetApproach(infra);
		hashMapApproach(infra);

	}

	private static void hashMapApproach(String[] infra) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int value = 1;
		for (int i = 0; i < infra.length; i++) {
			if (hm.containsKey(infra[i])) {
				hm.put(infra[i], hm.get(infra[i]) + 1);
			} else {
				hm.put(infra[i], value);
			}
		}

		for (String string : hm.keySet()) {
			if (hm.get(string) > 1) {
				System.out.println(string);
			}
		}
	}

	private static void hashSetApproach(String infra[]) {
		// TODO Auto-generated method stub

		System.out.println("***Hash Set First Approach ***");
		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					hs.add(infra[i]);
				}
			}
		}

		System.out.println(hs);

		System.out.println("***Hash Set Second Approach ***");
		HashSet<String> hs1 = new HashSet<String>();

		for (String string : infra) {
			if (hs1.add(string) == false) {
				//System.out.println(string);
			}
		}
		System.out.println(hs1);

		System.out.println("******");

	}

	private static void bruteForceApproach(String[] infra) {
		// TODO Auto-generated method stub

		for (int i = 0; i < infra.length; i++) {
			int count = 0;
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(infra[i]);
			}
		}
	}

}
