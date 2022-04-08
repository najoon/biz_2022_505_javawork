package com.callor.arrays.conteoller;

import com.callor.arrays.service.ServiceV2;

public class ConteollerV2 {
	public static void main(String[] args) {
		/*
		 * ServiceV2 serviceV2;
		 * ServiceV2 클래스를 사용하여 serviceV2 객체 를 선언하고
		 * 
		 * = new ServiceV2()
		 * 생성자  method를 호출하여 serviceV2 인스턴스로 생성한다
		 * 
		 * ServiceV2 type 의 serviceV2 인스턴스 생성하기.
		 * 
		 * serviceV2 인스턴스를 생성하기 위해서는 
		 * ServiceV2 클래스의 생성자 method(ServiceV2()) 를 호출하여
		 *  새로운 (new) 인스턴스를 만든다.
		 */
		ServiceV2 serviceV2 = new ServiceV2();
		serviceV2.scoreKorSum();
	}
}
