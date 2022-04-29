package com.callor.app.student;

public class Student3 {
	/*
	 * 급여를 현금으로 지급하려고 한다 대한민국 액면가 기준으로 최소 화폐메수로 지급하려고 한다 급여금액에 따라 최소 화폐매수 계산 수행
	 * 
	 * 대한민국 화폐단위 5만 ,1만, 5천, 1천, 5백, 1백, 50 ,10
	 * 
	 */
	public static void main(String[] args) {
		int pay = 3_928_880;
		// 5만원권
		int paper = (pay / 50_000);
		System.out.println("5만원"+paper);
		
		pay-= paper * 50_000; // 5만원권 제외 금액
		
		paper = (pay / 10_000);
		System.out.println("1만원"+paper);
		

	}

}
