package Eps;

public class doubleMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		
		System.out.println(Math.min(Long.MIN_VALUE, Integer.MIN_VALUE));
		System.out.println(Math.min(Float.MIN_VALUE, Long.MIN_VALUE));
		System.out.println(Math.min(Float.MIN_VALUE, Double.MIN_VALUE));
		
		System.out.println(Math.min(Double.MIN_VALUE,Float.MIN_VALUE));

	}

}
