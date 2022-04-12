package com.callor.arrays.exec;

public class ExecV4 {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		// 짝수인 수를 덧셈할 변수 선언
		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			boolean bYes = intNum[i] % 2 == 0;

			if (bYes) {
				intSum += intNum[i];
			}

		}
		System.out.println("짝수의 합 : " + intSum);
	}

}
