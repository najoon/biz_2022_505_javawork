package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {
	
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		for(int i = 0; i < 10 ; i++) {
			// bookVO1 을 10번 다시 생성하면서
			// title  에 settiong
			BookVO bookVO = new BookVO();
			bookVO.setTitle("Do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
			
		}
		for(BookVO vo : bookList) {
			System.out.println(vo.toString());
			
		}
	}

}
