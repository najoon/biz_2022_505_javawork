package com.najoon.service;

public class Service_01 {
	public void guguDan() {
		int intNum1 = 1;

		for (; intNum1 < 10; intNum1++) {
			System.out.printf("\n%d * %d = %d", 3, intNum1, 3 * intNum1);
		}
	} // guguDan()
	public void guguDan(int Num1) {
		int intNum1 = 1;
		for (; intNum1 < 10; intNum1++) {
			System.out.printf("\n%d * %d = %d",Num1,intNum1,Num1 * intNum1);
		}

	}
}
