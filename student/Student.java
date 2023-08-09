package org.student;

import org.department.department;

public class Student extends department {
//:studentName(),studentDept(),studentId()
	public void StudentName() {
		System.out.println("Soundarya");
	}
	public void StudentDept() {
		System.out.println("Information Technology");
	}
	public void StudentId() {
		System.out.println("19290");
	}

public static void main(String[]args) {
	Student Std=new Student();
	Std.StudentName();
	Std.StudentDept();
	Std.StudentId();
	Std.DepName();
	Std.collegeName();
	Std.collegeode();
	Std.collegeRank();
	}
}