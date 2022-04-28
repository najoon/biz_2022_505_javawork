package com.callor.app.primes;

public class Exec7 {
	public static void main(String[] args) {
		int[] intNum = new int[100];

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 2;
		}
		
		int Sum = 0;

		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {

			} else {
				Sum++;
			}
		}
		System.out.println("소수는 : " + Sum + "개");
	}

}
