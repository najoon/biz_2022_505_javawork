package com.callor.app.model;

public class ScoreVO {
	int Num;
	int Kor;
	int Eng;
	int Math;
	int Sum;
	int End;

	public ScoreVO(int num, int kor, int eng, int math, int sum, int end) {
		super();
		Num = num;
		Kor = kor;
		Eng = eng;
		Math = math;
		Sum = sum;
		End = end;
	}
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ScoreVO [Num=" + Num + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math + ", Sum=" + Sum + ", End="
				+ End + "]";
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getSum() {
		return Sum;
	}

	public void setSum(int sum) {
		Sum = sum;
	}

	public int getEnd() {
		return End;
	}

	public void setEnd(int end) {
		End = end;
	}

}
