package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int num1 = 0;
		int intSum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				intSum += num[i];
				num[i] = 1;
				num1 += num[i];
			}

		}
		System.out.println("짝수 : " + num1 + "개");
		System.out.println("짝수의 합 : " + intSum);
	}

}
