package com.najoon.service;

import com.najoon.utils.LinePrintV1;

public class ServiceV7 {

	public void serviceV7() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		LinePrintV1 linePrintV1 = new LinePrintV1();
		System.out.printf("\n %s",linePrintV1.dLine);
		int intKor = arr[1];
		int intEng = arr[2];
		int intMath = arr[3];
		int intSum = intKor + intEng + intMath;
		System.out.printf("\n 국어 : %d",intKor);
		System.out.printf("\n 영어 : %d",intEng);
		System.out.printf("\n 수학 : %d",intMath);
		System.out.printf("\n 합 : %d",intSum);
	}
}