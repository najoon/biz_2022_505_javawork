package com.callor.classes.sevice;

public class ScoreSeviceV3 {
	protected String[] students;
	protected int[] intKor;

	public ScoreSeviceV3() {
		this(10);
	}

	public ScoreSeviceV3(int length) {
		students = new String[length];
		intKor = new int[length];
	}

	public ScoreSeviceV3(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}
}
