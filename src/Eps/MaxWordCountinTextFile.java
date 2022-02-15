package Eps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxWordCountinTextFile {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\akandula\\OneDrive - GVC Group\\Desktop\\Tomorrow.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));

		String str = br.readLine();
		Map<String, Integer> hmap = new HashMap<String, Integer>();

		while (str != null) {
			String splitStrings[] = str.toLowerCase().split(" ");

			for (String string : splitStrings) {
				if (!(string.equals(""))) {
					if (hmap.containsKey(string)) {
						hmap.put(string, hmap.get(string) + 1);
					} else {
						hmap.put(string, 1);
					}
				}
			}
			str = br.readLine();
		}

		for (String string : hmap.keySet()) {
			System.out.println(string + " " + hmap.get(string));
		}

		System.out.println("*******************");
		int highestValue = Collections.max(hmap.values());

		Iterator<String> iterates = hmap.keySet().iterator();
		while (iterates.hasNext()) {
			if (hmap.get(iterates.next()) == (highestValue)) {
				iterates.remove();
			}
		}

		int highestValue3 = Collections.max(hmap.values());
		System.out.println(highestValue3);
		for (String string : hmap.keySet()) {
			if (hmap.get(string) == highestValue3) {
				System.out.println(string + " " + hmap.get(string));
			}
		}

	}
}
