package com.konic.jdbc.main;

import java.util.List;

import com.konic.Dao.StudentDAO;

import com.konic.model.Student;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO(); 
		
		dao.addStudent(new Student(18, "virat", 20));
		dao.addStudent(new Student(45, "rohit", 21));
		dao.addStudent(new Student(17, "pant", 19));
		
		List<Student> student = dao.getAllStudents();
		student.forEach(System.out::println);
	}

}
