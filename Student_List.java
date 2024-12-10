package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_List {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("Pavan");
		s.setAge(22);
		s.setAddress("Hyderabad");
		s.setCourse("Java");
		
		Student s1=new Student();
		s1.setId(103);
		s1.setName("Rohit");
		s1.setAge(24);
		s1.setAddress("Uttar Pradesh");
		s1.setCourse("Web Development");
		
		Student s2=new Student();
		s2.setId(104);
		s2.setName("Srinivas");
		s2.setAge(23);
		s2.setAddress("Benguluru");
		s2.setCourse("C++");
		
		Student s3=new Student();
		s3.setId(102);
		s3.setName("Swaroop");
		s3.setAge(21);
		s3.setAddress("Andhra Pradesh");
		s3.setCourse("Python");
		
		List<Student> stu=new ArrayList<Student>();
		stu.add(s);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		System.out.println(stu);
		//Collections.sort(stu);
		
		Collections.sort(stu, new StudentidComparator());
		//Collections.sort(stu, new StudentageComparator());
		//Collections.sort(stu, new StudentAddressComparator());
		//Collections.sort(stu, new StudentnameComparator());
		//Collections.sort(stu, new StudentCourseComparator());
		System.out.println(stu);
		
	}

}
