package com.callor.classes.controller;

import com.callor.classes.sevice.ScoreSeviceV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		ScoreSeviceV1 scoreSeviceV1 = new ScoreSeviceV1();
		int intResult = scoreSeviceV1.input();
		if(intResult < 0) {
			System.out.println("입력 도중 중단함");
		}else {
			System.out.println("입력을 모두 마침");
		}

	}
}
