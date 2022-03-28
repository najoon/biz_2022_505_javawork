package com.joon.review;

public class Review_03 {
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		/*
		 * add() : add method 라고 읽는다
		 * add() 를 실행하여(run 명령을 수행) 하여 그 결과를 intNum1 에 저장해 달라 
		 */
		intNum1 = add();
		intNum2 = 50;
		System.out.println(intNum1-intNum2);
		
		
	}
	/*
	 * add() 를 선언하기
	 */
	public static int add() {
		// 정수 100과 50을 덧셈하여 return 하기
		return 100 + 50;
		
		
	}
}
