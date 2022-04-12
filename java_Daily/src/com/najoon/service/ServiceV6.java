package com.najoon.service;

import java.util.Scanner;

import com.najoon.utils.LinePrintV1;

public class ServiceV6 {
	public static void main(String[] args) {
		final int INT_NUM1 = 1;
		int intNum1 = (int) (Math.random() * 100) + 1;
		if (50 >= intNum1) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		double doNum1 = 1.23456789101234;
		System.out.printf("%14.11f",doNum1);
		LinePrintV1 linePrintV1 = new LinePrintV1();
	System.out.printf("\n %s",linePrintV1.dLine);
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("\n 아무숫자나 입력하세요.");
	int Num1 = scanner.nextInt();
	System.out.printf("아무숫자 : %d",Num1);
	
	int Num2 =Num1++;
	System.out.println(Num2);
	Num2 = Num1;
	System.out.println(Num2);
	}
}