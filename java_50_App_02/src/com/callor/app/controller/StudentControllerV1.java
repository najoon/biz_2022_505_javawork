package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;
import com.callor.app.service.impl.StudentServiceImplV1;
import com.callor.app.utils.Line;

public class StudentControllerV1 {
	private final MenuController menu;
	private final Scanner scan;
	private final StudentService stService;
	private final List<StudentVO> stList;

	public StudentControllerV1() {
		scan = new Scanner(System.in);
		menu = new MenuController();
		String stFileName = "src/com/callor/app/data/student.txt";
		stList = new ArrayList<>();
		stService = new StudentServiceImplV1(stList,stFileName);
	}

	public Integer selectMenu() {

		while (true) {
			menu.viewStMenu();
			String strKey = scan.nextLine();
			if (strKey.equals("QUIT")) {
				return -1;

			}
			Integer intKey = 0;
			try {
				intKey = Integer.valueOf(strKey);

			} catch (Exception e) {
				System.out.println("업무를 다시 시작");
				continue;
			}
			if (intKey == 1) {
				System.out.println("성적로딩");
				stService.loadStudent();
				System.out.println("성적파일을 모두 읽었습니다");
			} else if (intKey == 2) {
				// 전체 학생리스트 보이기
				List<StudentVO> stList = stService.getStudents();
						if(stList.size() < 1) {
							System.out.println("학생정보 파일 전체보기");
							continue;
						}
						System.out.println(Line.dLine(50));
						System.out.println("학생정보 리스트");
						System.out.println(Line.sLine(50));
						System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
						System.out.println(Line.sLine(50));
						for(StudentVO vo : stList) {
							System.out.print(vo.getStNum()+ "\t");
							System.out.print(vo.getStName()+ "\t");
							System.out.print(vo.getStDept()+ "\t");
							System.out.print(vo.getIntGrade()+ "\t");
							System.out.print(vo.getStTel()+ "\t");
							System.out.println(vo.getStAddr()+ "\t");
							
						}
				
			} else if (intKey == 3) {
				System.out.println("학번 검색 ");

			} else if (intKey == 4) {
				System.out.println("이름 검색");
			} else {
				System.out.println("1~4 중 선택");

			}
		}// end while

	}// end selectMenu

}
