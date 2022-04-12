package com.najoon.service;

import java.util.Scanner;

import com.najoon.utils.LinePrintV1;

public class ServiceV4 {
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;

	public int sumPrint() {

		Scanner scanner = new Scanner(System.in);
		System.out.println(LinePrintV1.dLine);
		System.out.println("삼숭고 성적");
		System.out.println(LinePrintV1.sLine);
		System.out.println("다음 성적을 50~100까지 입력하시오.");

		System.out.println("국어 >");
		intKor = scanner.nextInt();
		System.out.println("수학 >");
		intEng = scanner.nextInt();
		System.out.println("영어 >");
		intMath = scanner.nextInt();

		int intSum = intKor + intEng + intMath;

		return intSum;
	} // sumPrint end

	public void sum() {
		int Sum = sumPrint();

		System.out.println(LinePrintV1.dLine);
		System.out.println("삼숭고 성적");
		System.out.println(LinePrintV1.sLine);
		System.out.println("국어"+intKor);
		System.out.println("영어"+intEng);
		System.out.println("수학"+intMath);
		System.out.println(LinePrintV1.dLine);
		System.out.println(Sum);
	}

}