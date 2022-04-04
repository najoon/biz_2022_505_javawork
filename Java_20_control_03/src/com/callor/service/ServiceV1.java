package com.callor.service;

public class ServiceV1 {
	/*
	 * add() 는 staric 으ㅜ로 선언되었다
	 * add() 는 코드가 run 되는 순간 add() 를
	 * 사용가능한 산태다 된다.
	 * static method는 클래스.method()와 같이 출력된다/
	 */
	public static int add() {
		int intNum1 =(int)(Math.random() * 100) +1;
		int intNum2 =(int)(Math.random() * 100) +1;
		return intNum1 + intNum2;
	}
	public static int multi() {
		int intNum1 =(int)(Math.random() * 100) +1;
		int intNum2 =(int)(Math.random() * 100) +1;
		return intNum1 + intNum2;
		
		
	}
	

}
