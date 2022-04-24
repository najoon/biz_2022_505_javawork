package com.callor.score.service.exec;

import com.callor.score.service.ScoreService;
import com.callor.score.service.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {
	public static void main(String[] args) {
		// primitive(기본) type keyword
		// primitive type 변수 선언
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;
		
		
		// 첫글자가 대문자면 클래스 타입
		// class type keyword
		// class type 변수 선언
		// 참조형 변수 선언
		Integer intNum1 = 100;
		Float fNum2 = 100.3f;
		Boolean BYes1 = true;
				
		
		String str = "Korea";
		StudentVO stVO =new StudentVO();
		StudentVO[] stList = new StudentVO[10];
		
		ScoreService scService = new ScoreServiceImplV1();
		
	}
}
