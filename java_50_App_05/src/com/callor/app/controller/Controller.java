package com.callor.app.controller;

import com.callor.app.service.ServiceScore;

public class Controller {
	public static void main(String[] args) {
		ServiceScore serviceScoer = new ServiceScore();
		serviceScoer.makeScore();
		serviceScoer.scorePrint();
	}
}
