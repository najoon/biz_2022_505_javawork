package com.callor.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService{
	
	private final List<TodoVO> todoList;
	public TodoServiceImplV1() {
		// TODO Auto-generated constructor stub
		
		todoList = new ArrayList<>();
	}
	
	@Override
	public void todoInsert(String content) {
		// TODO Auto-generated method stub
		// 컴퓨터의 현재 날짜 시각을 읽어오기
		Date curDate = new Date(System.currentTimeMillis());
		
		//Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		//현재 날짜, 시각에 해당하는 문자열 생성하기
		// SimpleDateFormat 에 의해서 패턴대로 날짜 시각 문자열을 만든다
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		
		/*
		 * Data 관련하여 사용되는 key,id 값
		 * data 의 무결성을 보장하기 위하여 모든 데이터(레코드단위, row 단위)는
		 * 데이터를 유일하게 식별할수 있는 데이터를 가지고 있어야 한다.
		 * 각 언어 dbms 등에서는 고유의 방법ㅁ으로 id 를 만들고 관리한다.
		 * java 에서는 java.util.UUID 클래스를 사용하여
		 * 범 우주적으로 유일한 id 값을 생성하는 도구를 제공한다
		 * 
		 */
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();
		TodoVO tVO = TodoVO.builder().tKey(idStr).sdata(today).stime(time).tContent(content).build();
	todoList.add(tVO);
		
	}

	@Override
	public List<TodoVO> todoSelectAll() {
		
		return todoList;
	}

	@Override
	public TodoVO findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub
		
	}
/*
 * TODO 완료하기
 * 매개변수로 전달받은 num 값은 List 요소의 실제 값보다 1만큼 크다
 * num 값이 4라면 실제로를 3번 요소를 선택한 것이다
 * 
 * 선택한 요소의 edate, etime 부분을 현재 시스템의 날짜와 시간을 사용하여
 * 문자열로 바꾼다음 setter
 * 
 * 시스템 날짜와 시간은 위에 insert 부분 참고
 */
	@Override
	public void compTodo(Integer num) {
		// TODO Auto-generated method stub
		
	}

}
