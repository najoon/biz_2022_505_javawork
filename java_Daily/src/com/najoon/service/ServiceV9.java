package com.najoon.service;
/*
 * 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
ex) [1, 3, 3, 2, 1, 1, 4, 5, 5, 1, 3] ->[1, 3, 2, 4, 5]
 */

public class ServiceV9 {
private int[] intRandom;
private int intNum;
public void egtikeul() {
	intRandom = new int[10];
	for(int i = 0 ; i < intRandom.length; i++) {
		intRandom[i] = (int)(Math.random()*10)+1;
		intNum = intRandom[i];
		System.out.printf("%d, ",intNum);
	}
}
}
