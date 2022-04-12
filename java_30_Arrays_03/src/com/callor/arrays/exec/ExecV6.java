package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNums.length; i++) {
			boolean bYes = intNums[i] % 3 == 0;
			if (bYes) {
				System.out.print(intNums[i] + ",\t");

			}else if((i+1)%5 == 0) {
				System.out.printf("\n");
			}
		}
	}
}