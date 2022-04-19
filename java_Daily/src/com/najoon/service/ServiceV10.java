package com.najoon.service;

import java.util.Scanner;

import javax.sound.sampled.Line;

import com.najoon.utils.LinePrintV1;
import com.najoon.utils.LinePrintV2;

public class ServiceV10 {

	/*
	 * protected : private 의 성질을 가지면서 상속받은 클래스서 상속받아 변수를 선언한 것과 같은 효과를 낸다 인스턴스변수도
	 * 상속이 된다.
	 */
	private int[] intKor; // 선언만된 정수형 인스턴스 배열
	private String[] student; // 인스턴스 문자열 선언
	private Scanner scan; // Scanner
	private int lineLength;

	public ServiceV10() { // 기본 생성자 메서드
		this(10);

	}

	public ServiceV10(int length) { // 임의 생성자 개발자 가 필요에 의해 임의로 선언하는 생성자 매서드
									// 한 클래스에 같은이름의 매서드가 생성되어 있어도 아규먼트에 선언한 타입이 다르면 다른매서드로 인식한다
		intKor = new int[length];
		student = new String[length];
		scan = new Scanner(System.in); // scanner 를 사용할 준
		lineLength = 50;

	}

	public int input() {
		System.out.println(LinePrintV2.dLine(50));
		System.out.println("나준 고교 성적");
		System.out.println(LinePrintV2.sLine(50));
		int index = 0; //
		while (index < student.length) { // 조건식의 연산결과가 참(true)인 동안, 반복될 문장들적는다.
			System.out.print("이름 (중단 : END)>>");
			String strName = scan.nextLine();
			if (strName.equals("END")) { // .equals : equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
			return -1; // END 를 입력하면 -1 값이 return되고 controlltrV11 에서 if 문으로 종료되게 한다.
				 // break;strName에 입력한값이 END 면 .equals 비교연산문으로true break키워드가 실행된다.

			} // if end
			System.out.println("점수(정수로 ,END:중단 >>");
			String strKor = scan.nextLine();
			if(strKor.equals("END")) {
				// break;
				 return -1; // break 효과가 있
			} // if end
			int intScore = 0;
			
			/*
			 * 예외 처리하기 try-catch 
			 * exception 이 발생할수 있는 코드
			 */
			try {
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;
				
			} catch (Exception e) {
					System.out.println("입력한값 \""+strKor+"\"는 정수로 변경 불가");
					System.out.println("점수는 정수로만 입력하세요");
			}

		} // while end
		return 0;
	}

}
