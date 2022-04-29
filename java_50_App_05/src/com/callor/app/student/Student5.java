package com.callor.app.student;

public class Student5 {
	
	public static void main(String[] args) {
		int pay = (int)(Math.random()*10000)*100;
		int money = 50_000;
		boolean sw = true;
		System.out.println(pay);

		while (pay > 0) {
			int paper = pay / money;
			System.out.printf("%7d 권 : %5d 매\n", money, paper);

			pay -= paper * money;
			if (sw) {
				money = money / 5;

			} else {
				money = money / 2;

			}

			sw = !sw;

		}

	}

}
