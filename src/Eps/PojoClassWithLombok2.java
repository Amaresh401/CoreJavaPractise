package Eps;

public class PojoClassWithLombok2 {

	public static final int BAD_REQUEST = 400;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PojoClassWithLombok1 p = new PojoClassWithLombok1("Ramesh", 12, 2007, true);
		p.setStudentName("Amaresh");
		System.out.println(p.getStudentName());

	}

}