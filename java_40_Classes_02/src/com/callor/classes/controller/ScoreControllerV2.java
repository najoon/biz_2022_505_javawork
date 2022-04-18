package com.callor.classes.controller;

import com.callor.classes.sevice.ScoreSeviceV2;

public class ScoreControllerV2 {
	public static void main(String[] args) {
	
		ScoreSeviceV2 scoreSeviceV2 = new ScoreSeviceV2();
		int intResult = scoreSeviceV2.input();
		if(intResult < 0) {
			System.out.println("입력을 중단했습니다");
			
		}else {
			System.out.println("입력을 완료");
		}

	}
}
