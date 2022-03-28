package com.joon.review;

public class Review_01 {
	public static void main(String[] args) {
		/*
		 * int intNum1 = 0;// 변수의 선언 및 초기화 int intNum2 = 0; intNum1 = 12;// 변수에 값을 할당
		 * intNum2 = 10; int intSum = 0;// 변수의 선언 및 초기화 int intDffrence = 0; int
		 * intMultipule = 0; int intDivide = 0;
		 * 
		 * intSum = intNum1 + intNum2; // 변수에 변수를 할당 intDffrence = intNum1 - intNum2;
		 * intMultipule = intNum1 * intNum2; intDivide = intNum1 / intNum2;
		 * System.out.printf("\t%d + %d = %d", intNum1, intNum2, intSum);//\n 은 enter,\t
		 * 는 tab키,%d 정수 System.out.printf("\n%d - %d = %d", intNum1, intNum2,
		 * intDffrence); System.out.printf("\n%d * %d = %d", intNum1, intNum2,
		 * intMultipule); System.out.printf("\n%d / %d = %d", intNum1, intNum2,
		 * intDivide);
		 */
		int intNum1 = 0;
		int intNum2 = 0;
		intNum1 = 33;
		intNum2 = 50;
		int intSum = 0;
		int intDffrence = 0;
		int intMultipule = 0;
		int intDivide = 0;
		intSum = intNum1 + intNum2;
		intDffrence = intNum1 - intNum2;
		intMultipule = intNum1 * intNum2;
		intDivide = intNum1 / intNum2;
		System.out.printf("\n%d+%d=%d", intNum1, intNum2, intSum);
		System.out.printf("\n%d-%d=%d", intNum1, intNum2, intDffrence);
		System.out.printf("\n%d*%d=%d", intNum1, intNum2, intMultipule);
		System.out.printf("\n%d/%d=%d", intNum1, intNum2, intDivide);

	}
}
