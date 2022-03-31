package com.callor.controller;

public class boolean_04 {
	public static void main(String[] args) {
		boolean bYes1 = true;
		boolean bYes2 = true;

		int intNum1 = 33; 
		int intNum2 = 55;
		
		bYes1 = intNum1 == intNum2;
		bYes2 = intNum1 < intNum2;
		/*
		 * || : boolean 데이터의 OR(합) 연산
		 * && : boolean 데이터의 AND(곱셈) 연산
		 * 
		 */
		
		//(intNum1 == intNum2) OR (intNum2 < intNum2)
		boolean bWhat = bYes1 || bYes2;
		bWhat = bYes1 && bYes2 ;
		if(bYes1 || bYes2) {
			System.out.println(intNum1 + "가" + intNum2+"보다 작거나 같다");
		}
		bWhat = !(bYes1 || bYes2);
		System.out.println(bWhat);
		// !(false and true)
		bWhat = !(bYes1 && bYes2);
		System.out.println(bWhat);
	}
}
