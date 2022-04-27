package com.callor.app.exec;

public class Exec2 {

	/*
	 * 정수형 배열 10개를 생성하고 각 요소에 1~100까지 임의정수를 생성하여 저장하고 배열에 저장된 요소의 값을 모두 합산하여 출력
	 * 
	 */
	public static void main(String[] args) {
		int[] intNum = new int[10];

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			intSum += intNum[i];
		}
		System.out.println(intSum);
		
		intSum = 0;
		for(int i : intNum) {
			intSum = i;
			
		}
		System.out.println(intSum);

	}
}
