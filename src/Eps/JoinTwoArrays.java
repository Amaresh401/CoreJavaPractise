package Eps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class JoinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.Using Streams
		String[] batsmen={"Shewag","Sachin","Ganguly"};
		String[] bowler={"Zaheer Khan","Srinath","Venkatesh Prasad"};
		
		Stream<String> sbat = Arrays.stream(batsmen);
		Stream<String> sbow = Arrays.stream(bowler);
		
		String[] fullTeam = Stream.concat(sbat, sbow).toArray(abc -> new String[abc]);
		
		for (String string : fullTeam) {
			System.out.println(string);
		}
		
		
		// Google Guava using objects
		System.out.println("**********");
		String[] allTeam = ObjectArrays.concat(batsmen, bowler,String.class);
		for (String string : allTeam) {
			System.out.println(string);
		}
		
		
		// For primitive data types
		System.out.println("**********");
		int[] p1={1,2,3};
		int[] p2={4,5,6};
		
		int[] p3=Ints.concat(p1,p2);
		for (int i : p3) {
			System.out.println(i);
		}

	}

}
