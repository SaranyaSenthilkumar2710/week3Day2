package org.student;

import org.department.Department;

public class Student extends Department
{
	public static void studentName() {
		System.out.println("Student Name : Yazhini");
	}
	public static void studentId() {
		System.out.println("Student Id : 1341");
	}
	public static void studentDept() {
		System.out.println("Student Department : CS");
	}
	public static void main(String[] args) {
		Department d1 = new Department();
		d1.collegeCode();
		d1.collegeName();
		d1.collegeRank();
		d1.deptName();
		studentName();
		studentId();
		studentDept();
	}
}
