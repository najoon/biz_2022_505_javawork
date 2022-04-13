package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * 	makeScore()
 * printScore()
 * SumScore()
 * 
 * 등의 method 를 선언하고
 * 임의 성적을 생성하여 intKor 에저장
 * 성적일람표 출력
 * 총점계산
 */

public class ScoreServiceV5 {
	private int[] intKor; // private키워드 정수형 타입의 intKor 인스턴스 배열 선언
	int intSum; // 정수형 intSum 인스턴스 변수 선언

	public void makeScore() { // 리턴타입이 void 인 makeScore() 선언
		intKor = new int[100]; // intKor 인스턴스 배열 100개 생성
		/*
		 * for(int i = 0; i < intKor.length ; i++) : 
		 * for문 내에 정수형 변수i 를 선언하고 0으로 초기화했다 ; < 배교연산자를 이용하여 i 는 intKor.length(100의 값이 들어있다) 보다 작다 ;
		 * 증감연산자 i++ 변수 i 값을 1증가시킨 
		 * 
		 */
		for (int i = 0; i < intKor.length; i++) {	
			intKor[i] = (int) (Math.random() * 100) + 1; // intKor[i] 배열의 값이 100 이 될때까지 랜덤 메서드 반복
		}

	}

	public void printScore() {
		System.out.println("성적일람표");
		System.out.println(Line.dLine(60));
		for (int i = 0; i < intKor.length; i++) {
			intSum = intKor[i];
			System.out.printf("%d번 :  %d점 \t", i, intSum);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

	public void SumScore() {
	System.out.println(Line.sLine);
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];

		}
		System.out.println("총점계산 : " + intSum);
	}
}
