package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

/*
 * ServiceV2 클래스에 gogodan() 를 선언하고
 * gogodan() 는 3단 구구단을 출력한다.
 * ComtrollerV2 에서는 gogodan() 호출하여 
 * 구구단을 보여준다
 */
public class controllerV2 {
	public static void main(String[] args) {
		ServiceV2 serviceV2 = new ServiceV2();

		serviceV2.guguDan();
		System.out.printf("\n===============");
		serviceV2.guguDan(8);
	}

}
