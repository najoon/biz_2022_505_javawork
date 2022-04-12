package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + ",\t");
			if ((i + 1) % 5 == 0)
			{
				System.out.println();
			}

		}
	}

}
