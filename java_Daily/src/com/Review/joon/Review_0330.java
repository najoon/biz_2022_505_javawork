package com.Review.joon;

public class Review_0330 {
	public static void main(String[] args) {
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		System.out.println(douNum1);
		System.out.println(douNum2);
		double douSum = douNum1 + douNum2;
		double douDff = douNum1 - douNum2;
		double douMulti = douNum1 * douNum2;
		double douDivide = douNum1 / douNum2;
		System.out.printf("\n %f + %f = %f", douNum1, douNum2, douSum);
		System.out.printf("\n %f - %f = %f", douNum1, douNum2, douDff);
		System.out.printf("\n %f * %f = %f", douNum1, douNum2, douMulti);
		System.out.printf("\n %3.2f / %3.2f = %3.2f", douNum1, douNum2, douDivide);
		//3.2 정수 3번째 자리까지 보여주고 실수 2번째 자리까지 보기
		System.out.printf("\n=================================================== \n");
		double doNum1 = 0.0;// 실수형 변수 선언 및 초기화
		double doNum2 = 0.0;
		doNum1 = Math.random();// 랜덤값을 부여
		doNum2 = Math.random();
		System.out.println(doNum1);  
		System.out.println(doNum2);
		doNum1 *= 1000;  // 0.000~999.999 까지 의 값을 저장
		doNum2 *= 1000;
		System.out.println(doNum1);
		System.out.println(doNum2);
		doNum1++; // 1씩 더해서 1.000 ~ 1000.999 까지의 값
		doNum2++;
		int intNum1 = (int)doNum1; // 실수를 강제로(int) 정수형 변수에 값을 저장 
		int intNum2 = (int)doNum2;
		int intSum1 = 0;
		intSum1 = intNum1 + intNum2;
		System.out.println(intSum1);
		System.out.printf("\n %d + %d = %d",intNum1,intNum2,intSum1);
		System.out.printf("\n=================================================== \n");
	}
}
