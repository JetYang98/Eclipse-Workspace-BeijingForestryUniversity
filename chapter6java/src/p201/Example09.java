package p201;

import java.util.HashSet;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs = new HashSet<Student>();
		Student stu1 = new Student("1", "Jack");
		Student stu2 = new Student("2", "Rose");
		Student stu3 = new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}

}
