package com.callor.app.student;

public class Student2 {
	public static void main(String[] args) {
		int student = 0;
		student = (int) (Math.random() * 25) + 25;
		int pizza = 6;
		if (student % pizza == 0) {
			System.out.printf("인원 %d 는 %d 의 피자가 필요",student,student/pizza);
		}else {
			int pan = (student/ pizza)+1;
			System.out.printf("인원 %d 는 %d 의 피자가 필요",student,pan);
			
		}

	}

}
