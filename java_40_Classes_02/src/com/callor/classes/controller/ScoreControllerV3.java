package com.callor.classes.controller;

import com.callor.classes.sevice.ScoreSeviceV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		
		ScoreSeviceV3 scoreSeviceV3 = new ScoreSeviceV3();
		
		scoreSeviceV3 = new ScoreSeviceV3(20);
		
		// String strNames = new String[5];
		// strNames[0] = "홍길동"
		// strNames[1] = "나준희"
		// strNames[2] = "성춘향"
		// strNames[3] = "임꺽정"
		// strNames[4] = "장보고"
		// 한줄자리 코드로 
		String[] strNames ={"홍길동","나준희","성춘향","임꺽정","장보고"};
		
		scoreSeviceV3 = new ScoreSeviceV3(strNames);
		
	}

}
