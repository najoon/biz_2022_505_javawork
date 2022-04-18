package com.callor.classes.exec;

public class String2intV2 {
	public static void main(String[] args) {
		String strNum = "";
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("숫자로 변환 할수 없음");
		}else {
			intNum =Integer.valueOf(strNum);
		}
		
		/*
		 * 만약 키보드 등을 사용하여 값을 입력할 경우 
		 * 은연중에 space 키를 눌러서 white space 가 감기응 경우가 
		 * 발생할 것이다
		 * space 키를 한 번 , 두번, 여러번 입력한다고 가정할 경우 
		 * 모든 경우의 수를 if() 사용하여 검사한다면
		 * 많은 불필요한 코드가 추가 되어야 할 것이다.
		 */
		if(strNum.equals("   ")) {
			System.out.println("space 는 숫자로 변환할수 없음");
		}
	}
}
