package com.callor.score.service.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.domain.StudentVO;

public class ListEx2 {

	public static void main(String[] args) {
		List<StudentVO> stList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			StudentVO vo = new StudentVO();
			int intNum = (int) (Math.random() * 100) + 1;
			int intGrade = (intNum % 4) + 1;
			String strGrade = intGrade + "";
			String strNum = String.format("%05d", i + 1);
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			
			System.out.println(vo.toString());
			stList.add(vo);

		}
	}
}
