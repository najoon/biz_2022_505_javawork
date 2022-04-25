package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;

public class ScoreContrlloerV1 {

		public static void main(String[] args) {
			String[] stNames = {"홍길동", "이몽룡", "성춘향", "임꺽정","장영자"};
			ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1(stNames);
			scoreServiceV1.makeScore();
			scoreServiceV1.printScore();
		
			
		}
	
}
