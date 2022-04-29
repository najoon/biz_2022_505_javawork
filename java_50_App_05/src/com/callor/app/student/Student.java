package com.callor.app.student;

public class Student {
	public static void main(String[] args) {
		int student = 0;
		student = (int) (Math.random() * 25) + 25;
		int pizza = 6;
		System.out.println(student);
		int pan = 0;
		pan = (student / pizza)+1;
				System.out.println("학생" + student + "명 : " + pan + "판");

			

		}
	
}
