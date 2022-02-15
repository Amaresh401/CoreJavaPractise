package Eps;

import java.util.ArrayList;
import java.util.List;

public class StudentNameClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentNameClass2 s1 = new StudentNameClass2("Amaresh", 100, 30);
		StudentNameClass2 s2 = new StudentNameClass2("Rajesh", 101, 28);
		StudentNameClass2 s3 = new StudentNameClass2("Venkatesh", 102, 26);
		StudentNameClass2 s4 = new StudentNameClass2("Ramesh", 104, 57);

		List<StudentNameClass2> studentList = new ArrayList<StudentNameClass2>();

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);

		// First approach - general approach
		int highestAge = 0;
		String studentName = null;

		for (int i = 0; i < studentList.size(); i++) {
			if (highestAge < studentList.get(i).getAge()) {
				highestAge = studentList.get(i).getAge();
				studentName = studentList.get(i).getStudentName();
			}
		}
		System.out.println("Student Name is " + studentName + " and his age is " + highestAge);

		// Second Approach - using streams
		studentList.stream().filter(e -> e.getAge() >= 30).forEach(p -> System.out.println(p.getAge()+" : "+p.getStudentName()));
		
		int highestsAge = studentList.stream().map(e -> e.getAge()).max(Integer :: compare).get();
		System.out.println(highestAge);
		
		studentList.stream().filter(e -> e.getAge() == highestsAge).forEach(p -> System.out.println(p));

	}

}
