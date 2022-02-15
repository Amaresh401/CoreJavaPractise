package AutomationReinvented.Programs;

import java.util.ArrayList;

public class AddingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Amaresh");
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Kandula");
		
		ArrayList<String> combinedArray = new ArrayList<String>();
		combinedArray.addAll(array1);
		combinedArray.addAll(array2);
		
		for (String string : combinedArray) {
			System.out.println(string);
		}

	}

}
