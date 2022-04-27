package com.callor.app.exec;

public class Exec3 {
	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() 메서드에 매개변수로 전달하고
	 * 
	 */
	public static void main(String[] args) {
		int intSum =0;
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intSum += even(num);
		}
		System.out.println("짝수 합 : "+ intSum);
		
	}

	public static int even(int num) {
		if (num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
		
	}
}
