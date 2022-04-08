package com.callor.controller;

public class ControllerV2 {
	public static void main(String[] args) {

		// if(비교연산식) { }
		// for(;;){ }
		int intNum = 1;
		//for 반목문을 아무런 조건없이 실행하여 무한반복
		for (;;) {
			System.out.printf("\t%d x %d = %d\n", 3, intNum, 3 * intNum++);

		}// end for

	}
}
