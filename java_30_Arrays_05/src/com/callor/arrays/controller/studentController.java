package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class studentController {
	public static void main(String[] args) {
		
		//기본 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 service10 = new StudentServiceV1();
		
		// 임의 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 service = new StudentServiceV1(3);
		
		service.inputStudent();
		// service.printStudent();
	}
	
}
