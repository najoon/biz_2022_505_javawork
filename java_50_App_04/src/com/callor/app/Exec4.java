package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		int count = 0;
		int index = 0;
		for (int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if (num >= 55) {
				// 변수에 담으면 가장 마지막 값만 담긴다.
				count = num;
				index = i;
			}

		}
		System.out.printf("\t%3d 번째 에서 : %3d\n", index, count);

	}

}
