package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV2;

public class ScoreContrlloerV2 {

		public static void main(String[] args) {
	String[] stNames = {"홍길동","나준희","성춘향","장보고","이몽룡"};
			ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
			
			scoreServiceV2.makeScore();
			scoreServiceV2.printScore();
	
	
			
		}
	
}
