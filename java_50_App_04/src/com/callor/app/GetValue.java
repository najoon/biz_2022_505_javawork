package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class GetValue {
	public List<Integer> getList(int length) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {

			int num = (int) (Math.random() * 100) + 1;
			list.add(num);
		}
		return list;
	}

	public static int getArray(int length) {
		int[] num = new int[length];
		for (int i = 0; i < num.length; i++) {
			int nums = (int) (Math.random() * 100) + 1;
			num[i] = nums;

		}
		return num;
	}
}
