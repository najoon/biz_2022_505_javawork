package com.callor.var;

public class Var_04 {

	public static void main(String[] args) {

		int intNum1 = (int) (int) (Math.random() * 100) + 1;
		int intNum2 = (int) (int) (Math.random() * 100) + 1;

		boolean bCompare = true;
		bCompare = intNum1 > intNum2;
		if (bCompare) {
			System.out.println(intNum1 + "는" + intNum2 + "보다 크다");
		} else {
			System.out.println(intNum1 + "은" + intNum2 + "보다 크지 않다");
		}
		if (bCompare) {
			System.out.printf("\n %d 는 %d 보다 크다", intNum1, intNum2);
		} else {
			System.out.printf("\n %d 는 %d 보다 크지않다", intNum1, intNum2);
		}
	}
}