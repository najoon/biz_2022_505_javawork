package com.callor.app.exec;

public class Exec4 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		boolean boNum = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				boNum = true;
				break;
			}
		}
		if (boNum) {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		} else {
			System.out.println(num + "은(는) 소수입니다.");
		}

	}

}
