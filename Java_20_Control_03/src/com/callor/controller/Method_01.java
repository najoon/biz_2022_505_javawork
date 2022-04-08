package com.callor.controller;

public class Method_01 {

	public static void main(String[] args) {

		int Num1 = num();
		System.out.println(Num1);
	}

	public static int num() {
		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;
		intNum1 = (int) (Math.random() * 100) + 1;
		intNum2 = (int) (Math.random() * 100) + 1;

		intNum3 = intNum1 + intNum2;
		// 귀찮으면 변수에 안담고 intNum1 + intNum2 return 해도됨
		return intNum3;

	}
}
