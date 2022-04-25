package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {
	
	
	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		scores = new ScoreV2VO[length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();

		}

	}

	//
	public ScoreServiceV2(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);

		}

	}


	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intSum = 0;
		double fAvg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-3s\t",scores[i].getStName());
			System.out.printf("%4d\t",scores[i].getIntKor());
			System.out.printf("%4d\t",scores[i].getIntEng());
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%6d\t",scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg());
			
			intKorSum += scores[i].getIntKor();
			intEngSum += scores[i].getIntEng();
			intMathSum += scores[i].getIntMath();
			intSum += scores[i].getIntSum();
			fAvg += scores[i].getfAvg();
			
			
		}
		System.out.println(Line.dLine(50));
		System.out.printf("%-3s\t","총점:\t");
		System.out.printf("%4d\t",intKorSum);
		System.out.printf("%4d\t",intEngSum);
		System.out.printf("%4d\t",intMathSum);
		System.out.printf("%6d\t",intSum);
		System.out.printf("%4.2f\n",fAvg / scores.length);
		
		System.out.printf(Line.dLine(50));
		
	}
		
		
}
