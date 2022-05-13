package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		for(int i = 0 ; i < num.length ; i++) {
			int num1 = num[i];
			System.out.printf("%d ",num1);
		}
		for(int i = 0 ; i < num.length ; i++) {
			sum += num[i];
		}
		System.out.printf("\n합 : %d",sum);
		int num1 = sum/10;
		System.out.printf("\n평균 : %d",num1);
	}

}
