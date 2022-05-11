package com.callor.todo.service;

import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	//to 를 추가하기
	public void todoInsert(String content);
	
	// 전체 todolist 조회하기
	public List<TodoVO> todoSelectAll();
	
	// key 값으로 1의 todolist 조회하기
	public TodoVO findByKey(String key);
	
	// todo 내용 변경하기
	public void update(TodoVO tVO);
	
	// 할일을 완료했을때 사용할 method
	public void compTodo(Integer num);
	
	// todolist 내용을 파일에 저장하기
	public void saveTodo(String fileName);

}