package com.najoon.service;
/*
 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
 */

public class ServiceV8 {
	private int[] intCoin;
	private int intNum;
	public void coin() {
		intNum = (int)(Math.random()*500)*10;// 10~4950 이 랜덤으로 생성됨;
		intCoin = new int[]{500, 100, 50, 10}; //[0] = 500,[1] = 100,[2]= 50,[3] = 10 값이 들어있는 배열 4개 생성
		
		System.out.println("거스름돈 : "+ intNum+"원"); //random 값 10~4950 이 들어 있는intNum를 출력한다.
		
		for(int i = 0 ; i < intCoin.length ; i++) {
			 
			System.out.println(intCoin[i] + "원 : " + intNum/intCoin[i]+"개");
			
			// intCoin[i] : i 값이 0-1-2-3 순으로 3이 될때까지 반복되어 intCoin[] 배열에 [0~3]이 담긴다
			// intNum 비교연산자 % intCoin[i] : intNum 나누기 intCoin 의 나머지 값이 intNum배열에 다시 담겨 println() 에서 intNum/intCoin[i] 이 실행된후 출력
			intNum = intNum % intCoin[i];
		}
		System.out.println(intCoin[0]);
		
		
	}
	
	
	}