package com.callor.service;

public class ServiceV1 {
	
	/*
	 * void type method 를
	 * gogodan 이름으로 선언하기
	 * void type  method 는 return 명령이 없어도 된다.
	 */
public void gogodan() {
	int intNum1 = 3;
	int intNum2 = 1;
	
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	System.out.printf("%d * %d = %d  \n",intNum1, intNum2, intNum1 * intNum2++);
	
}
}
