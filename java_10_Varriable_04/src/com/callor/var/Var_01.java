package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		//4칙 연산 결과를 저장 하기 위한 변수 선언 clear
		intNum1 = 33;
		intNum2 = 55;

		int intSum = 0;
		int intDeffrence = 0;
		int intMultipule = 0;
		int intDivide = 0;

		intSum = intNum1 + intNum2;
		intDeffrence = intNum1 - intNum2;
		intMultipule = intNum1 * intNum2;
		intDivide = intNum1 / intNum2;
		
		
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("\t%d - %d = %d\n", intNum2, intNum1, intDeffrence);
		System.out.printf("\t%d * %d = %d\n", intNum1, intNum2, intMultipule);
		System.out.printf("\t%d / %d = %d\n", intNum1, intNum2, intDivide);

	}
}
