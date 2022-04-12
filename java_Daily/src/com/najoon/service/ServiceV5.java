package com.najoon.service;

import java.util.Scanner;

import com.najoon.utils.LinePrintV1;

public class ServiceV5 {
	int intKor1 = 0;
	int intEng1 = 0;
	int intMath1 = 0;

	public void sum() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(LinePrintV1.dLine);
		System.out.println("준희의 성적표");
		System.out.println(LinePrintV1.sLine);
		System.out.println("국어 > ");
		intKor1 = scanner.nextInt();
		System.out.println("영어 > ");
		intEng1 = scanner.nextInt();
		System.out.println("수학 > ");
		intMath1 = scanner.nextInt();
		System.out.println(LinePrintV1.dLine);
		int intSum = intKor1 + intEng1 + intMath1;
		System.out.println(intSum);

	} // sum() end

}
