package Eps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = -1234234;
		Map<Long, Integer> numberMap = new HashMap<Long, Integer>();

		while (number != 0) {

			long reminder = number % 10;

			if (numberMap.containsKey(reminder)) {
				numberMap.put(reminder, numberMap.get(reminder) + 1);
			} else {
				numberMap.put(reminder, 1);
			}
			number = number / 10;

		}

		Set<Long> numberMapSet = numberMap.keySet();
		for (Long long1 : numberMapSet) {
			System.out.println(long1 + " " + numberMap.get(long1));
		}

	}

}