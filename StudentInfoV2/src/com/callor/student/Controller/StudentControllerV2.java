package com.callor.student.Controller;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.service.Impl.StudentServiceImplV2;

public class StudentControllerV2 {

	/*
	 * ControllerV1 에서는 ServiceV1 을 사용할때 단순히 기본생성자를 호출하여 Servicev1 에서 stdList 와
	 * fileName 을 직접 관리하도록 하였다 만약 list 변수와 파일을 다른것으로 바꾸려면 어쩔수없이 ServiceV1 코드를 변경해야
	 * 한다
	 * 
	 * 하지만 V2 에서는 ControllerV2 에서 ServiceV2 를 사용할때 stdList 와 fileName 을 생성자 매개변수로
	 * 전달하고 있다 이러한 패턴음 Contreoller 와 Service 간에 결합도를 낮추어 좋은 패턴의 코드가 된다.
	 */
	public static void main(String[] args) throws FileNotFoundException {

		List<StudentVO> stdList = new ArrayList<>();
		String fileName = "src/com/callor/student/student.txt";
		
		// java 1.5 이상에서 text 파일에 내용을 기록하기 위하여
		// 단독으로 사용할 수 있는 클래스
		String printFile = "src/com/callor/student/print.txt";

		PrintStream ps = new PrintStream(printFile);
		PrintStream psConsole = System.out;
		
		// stdList와 원본데이터(student.txt) 파일을 생성자에 주입하여
		// student.txt 파일에서 데이터를 읽어 stdList 를 준비해라
		StudentService stService = new StudentServiceImplV2(stdList, fileName, ps);

		stService.printStudent();
		
		StudentService stService1 = new StudentServiceImplV2(stdList, fileName, psConsole);
		stService1.printStudent();

	}

}
