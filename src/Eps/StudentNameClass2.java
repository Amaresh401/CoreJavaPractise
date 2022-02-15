package Eps;

public class StudentNameClass2 {

	private String studentName;
	private int rollNumber;
	private int age;

	public StudentNameClass2(String studentName, int rollNumber, int age) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return " [studentName=" + studentName + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}
	
	

}
