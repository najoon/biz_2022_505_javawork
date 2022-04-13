package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;
import com.callor.arrays.utils.Line;

public class ScoreControllerV5 {
	public static void main(String[] args) {
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5();
		scoreServiceV5.makeScore();
		scoreServiceV5.printScore();
		scoreServiceV5.SumScore();
		
	}
}