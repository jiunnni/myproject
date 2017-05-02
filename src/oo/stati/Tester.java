package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Student s1= new Student(58,98,66);
		Student s2= new Student(89,56,77);
		s1.pass=70;
		s1.print();
		s2.print();

		GraduateStudent gstu1=new GraduateStudent(68,85,89);
		GraduateStudent gstu2=new GraduateStudent(78,89,60);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student(58,98,66 ));
		list.add(new Student(67,56,77 ));
		list.add(new Student(88,99,85 ));
		list.add(new Student(66,87,66 ));
		list.add(new GraduateStudent(58,98,66 ));
		list.add(new GraduateStudent(78,89,60 ));
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);
			stu.print();
		}
		

	}

}
