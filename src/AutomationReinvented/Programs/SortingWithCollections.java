package AutomationReinvented.Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "C");
		hmap.put(2, "Java");
		hmap.put(3, "Python");

		System.out.println("Using KeySet");
		for (Integer string : hmap.keySet()) {
			System.out.println(string + ":" + hmap.get(string));
		}

		System.out.println();
		System.out.println("Using EntrySet");
		Set sets = hmap.entrySet();
		Iterator iterator = sets.iterator();

		while (iterator.hasNext()) {
			Map.Entry maps = (Entry) iterator.next();
			System.out.println(maps.getKey() + ":" + maps.getValue());
		}

	}

}