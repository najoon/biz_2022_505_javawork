package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {
	public static void main(String[] args) {
		ScoreServiceV4 scoreServiceV4 = new ScoreServiceV4(10);
		scoreServiceV4.makeScore();
		scoreServiceV4.printScore();
	}
}