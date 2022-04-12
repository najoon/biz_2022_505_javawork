package com.callor.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {
		int intNum2 = 0;
		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNum.length; i++) {
			boolean bYes = intNum[i] % 2 < 1;
			
			if(bYes) {
				intNum2++;
				
			}
			}
		System.out.println("짝수는 : " + intNum2 + "개");
		}

	}
