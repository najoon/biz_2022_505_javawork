package com.callor.todo.service;

import java.io.IOException;
import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	
	// TODO 를 추가하기
	public void todoInsert(String content);
	
	// 전체 TodoList 조회하기
	public List<TodoVO> todoSelectAll();
	
	// key 값으로 1개의 TodoList 조회하기
	public TodoVO findByKey(String key);
	
	// Todo 내용 변경하기
//	public void update(TodoVO tVO);
	/**
	 * 2022-05-13 설계변경
	 * sk12392
	 *
	 * update method 를 변경하기 
	 * TodoList 의 아이템 index 와 content 를 매개변수로 받아
	 */
	public void update(Integer num, String content);

	// 할일을 완료했을때 사용할 method	
	public void compTodo(Integer num);
	
	// TodoList 내용을 파일에 저장하기
	public void saveTodo(String fileName) throws IOException;
	

}
