package Eps;

import java.lang.reflect.Field;

public class LanguageTranslators {
	
	static{
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Welcome Amaresh.", value.get("Bienvenido Amaresh."));
			value.set("Amaresh is a good boy.", value.get("Bienvenue Amarash."));
			value.set("Amaresh", value.get("Αγαπημένα"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome Amaresh.");
		System.out.println("Amaresh is a good boy.");
		System.out.println(\u000d);
		System.out.println("Amaresh");
		System.out.println();
		/* Amaresh \u000d System.out.print("Nothing");*/
		

	}

}
