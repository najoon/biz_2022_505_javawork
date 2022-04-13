package com.najoon.service;
/*
 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
 */

public class ServiceV8A {
	private int[] intCoin;
	private int intMoney;

	public void coin() {
		intCoin = new int[] { 500, 100, 50, 10 };
		intMoney = (int) (Math.random() * 500) * 10;
		System.out.println("거스름돈 : "+intMoney+"원");
		for(int i = 0;i < intCoin.length;i++) {
			System.out.println(intCoin[i]+":"+intMoney/intCoin[i]+"개");
			intMoney = intMoney%intCoin[i];
		}
	}
}
