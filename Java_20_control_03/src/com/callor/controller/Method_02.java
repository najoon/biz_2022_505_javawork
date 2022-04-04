package com.callor.controller;

public class Method_02 {
	public static void main(String[] args) {
		int intNum1 = add();
		int intNum2 = multi();
		System.out.println(intNum1 + intNum2);
	}

	public static int add() {
		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;
		intNum1 = (int) (Math.random() * 100) + 1;
		intNum2 = (int) (Math.random() * 100) + 1;
		intNum3 = intNum1 + intNum2;
		return intNum3;
	}

	public static int multi() {
		int intMulti1 = 0;
		int intMulti2 = 0;
		int intMulti3 = 0;
		intMulti1 = (int) (Math.random() * 100) + 1;
		intMulti2 = (int) (Math.random() * 100) + 1;
		intMulti3 = intMulti1 * intMulti2;
		return intMulti3;
	}
}
