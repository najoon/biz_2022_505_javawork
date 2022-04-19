package com.najoon.service;

import java.util.Scanner;

public class ServiceV11 {
	protected int[] intKor;
	protected String[] student;
	protected Scanner scan;

	public ServiceV11() {
		this(10);
	}

	public int ServiceV11(int length) {
		intKor = new int[length];
		student = new String[length];
		scan = new Scanner[System.in];
		

		return 0;
	}
}
