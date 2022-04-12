package com.najoon.service;

public class ServiceV3 {
	int intNum1 = 0;
	int intNum2 = 0;
	int intSum1 = 0;
	int intSum2 = 0;
	public int sum() {
		intNum1 = (int)(Math.random()* 100) +1 ;
		intNum2 = (int)(Math.random()* 100) +1 ;
		intSum1 = (int)(Math.random()* 100) +1 ;
		intSum2 = intNum1+intNum2+intNum1;
	return intSum2;
	} //end sum() 
	public void sumPrint() {
		String dLine = "=";
		String sLine = "-";
		int intSum = sum();
		System.out.println(dLine.repeat(50));
		System.out.println("준희의 성적표");
		System.out.println(sLine.repeat(50));
		System.out.println("수학 : " + intNum1);
		System.out.println("영어 : " + intNum2);
		System.out.println("과학 : " + intSum1);
		System.out.println(dLine.repeat(50));
		System.out.println("총점 : " + intSum);
		
	}
}