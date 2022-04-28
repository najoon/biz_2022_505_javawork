package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		for (int i =0 ; i <nums.size(); i++) {
			if (nums.get(i) >= 55) {
				System.out.printf("\t%3d 번째 에서 : %3d\n", i, nums.get(i));
				break;
			}

		}

	}
}
