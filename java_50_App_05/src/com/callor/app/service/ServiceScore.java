package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.list.Line;
import com.callor.app.model.ScoreVO;

public class ServiceScore {
	private final List<ScoreVO> list;

	public ServiceScore() {
		List<ScoreVO> stlist = new ArrayList<>();
		this.list = stlist;
	}

	public void makeScore() {
		int num = 1;
		for (int i = 0; i < 20; i++) {
			ScoreVO sCr = new ScoreVO();
			sCr.setNum(num++);
			sCr.setKor((int)(Math.random()*50)+50);
			sCr.setEng((int)(Math.random()*50)+50);
			sCr.setMath((int)(Math.random()*50)+50);
			list.add(sCr);
		}
	}

	public void scorePrint() {
		int intSum = 0;
		int intAve = 0;
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumSum = 0;
		int sumAve = 0;
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		for (int i = 0; i < 20; i++) {
			sumKor += list.get(i).getKor();
			sumEng += list.get(i).getEng();
			sumMath += list.get(i).getMath();
			sumSum += intSum;
			sumAve += intAve;
			intSum = list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath();
			intAve = intSum / 3;
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n",
					list.get(i).getNum(),
					list.get(i).getKor(),
					list.get(i).getEng(),
					list.get(i).getMath(),
					intSum,
					intAve);
		}
		System.out.println(Line.dLine(50));
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d",sumKor,sumEng,sumMath,sumSum,sumAve);
		
	}

}
