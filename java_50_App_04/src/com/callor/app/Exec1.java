package com.callor.app;

public class Exec1 {
	// 정수형 배열 100 개를 선언하고
	// 각 요소에 1~100 까지의 임의 정수 저장
	//

	public static void main(String[] args) {
		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			int nums = (int) (Math.random() * 100) + 1;
			num[i] = nums;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 55) {
				System.out.println(num[i]);
			}

		}

	}

}
