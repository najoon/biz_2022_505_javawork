package com.callor.method;

public class Method_02 {
	public static void main(String[] args) {
		
		/*
		 * 명령문 해석
		 * 1. num() 를 실행하여 => num() 를 호출하여 실행하고
		 * 2. num()가 return 하는 데이터를 intNum 변수에 저장하라
		 * 
		 */
		int intNum1 = num();
		System.out.println(intNum1);
		double douNum1 = doNum();
		System.out.println(douNum1);
		long longNum1 = longNum();
		System.out.println(longNum1);
		float fNum1 = floatNum();
		System.out.println(fNum1);
		boolean bYes = bYes();
		System.out.println(bYes);

		String str = nation();
		System.out.println(nation());
	}

	public static int num() {
		int intNum1 = 40;
		int intNum2 = 60;
		int intSum = 0;
		intSum = intNum1 + intNum2;
		return intSum;
	}

	public static double doNum() {
		double doNum1 = (Math.random() * 10) + 1;
		double doNum2 = (Math.random() * 10) + 1;
		double doNum3 = doNum1 + doNum2;
		return doNum3;
	}

	public static long longNum() {
		long longNum1 = 500_000_00;
		long longNum2 = 500_000_00;
		long longNum3 = 0;
		longNum3 = longNum1 + longNum2;
		
		return longNum3;
	}

	public static float floatNum() {
		return 9.123457f;
	}

	public static boolean bYes() {
		int intNum3 = (int) (Math.random() * 150) + 1;
		int intNum4 = (int) (Math.random() * 150) + 1;
		boolean byes = intNum3 <= intNum4;
		return byes;
	}

	public static String nation() {
		String strName = null;
		strName = "안녕하세요";
		return strName;
	}
}
