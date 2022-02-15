package AutomationReinvented.Programs;

class overriding {

	public void test(String name) {

		System.out.println("testone");

	}
}

class child extends overriding {

	protected void test() {

		// super.test();

		System.out.println("testtwo");

	}

}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child child = new child();
		child.test();

	}

}
