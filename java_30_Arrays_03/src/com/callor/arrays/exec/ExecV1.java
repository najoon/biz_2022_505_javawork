package com.callor.arrays.exec;

public class ExecV1 {
	public static void main(String[] args) {
		int intNum = (int) (Math.random() * 100) + 1;
		
		
		if (intNum % 2 == 0) {
			System.out.printf("%d = 짝수\n",intNum);
		} else {
			System.out.printf("%d = 홀수\n",intNum);
		}
	}

}
