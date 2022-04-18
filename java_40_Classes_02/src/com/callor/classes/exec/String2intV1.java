package com.callor.classes.exec;

public class String2intV1 {
public static void main(String[] args) {
	String strNum = "33";
	int intNum = Integer.valueOf(strNum);
	/*
	 * 문자열혈 숫자를 실수(float)형 숫자로 형변환
	 */
	strNum = "33.2";
	float fNum = Float.valueOf(strNum);
	
	float fSum = intNum + fNum;
	System.out.println(fSum);
}
}
