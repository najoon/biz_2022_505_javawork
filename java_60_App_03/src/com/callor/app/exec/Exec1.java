package com.callor.app.exec;

public class Exec1 {
	public static void main(String[] args) {
		int intNum = 0;
		for (int i = 0; i < 10; i++) {
			intNum = (int) (Math.random() * 100) + 1;
			if (intNum % 2 == 0) {
				System.out.printf("%d 짝수 : %d \n", i, intNum);
			} else {
				System.out.printf("%d 홀수 : %d \n", i, intNum);
			}

		}
	}

}
