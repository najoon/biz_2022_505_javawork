package com.callor.arrays.service;
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
int[] intKor;
int intSum;
	
public void makeScore() {
	intKor = new int[100];
	for(int i = 0; i<intKor.length; i++) {
		intKor[i] = (int)(Math.random()*100)+1;
	}
		
	}public void printScore() {
		for(int i= 0; i < intKor.length; i++) {
			intSum = intKor[i];
			System.out.printf("%d번 :  %d점 \t",i,intSum);
			if((i + 1)%5 == 0) {
				System.out.println();
			}
		}
		}public void SumScore() {
			for(int i = 0;i < intKor.length; i++) {
				intSum += intKor[i];
				
				
			}System.out.println("총점계산 : "+intSum);
}
}
