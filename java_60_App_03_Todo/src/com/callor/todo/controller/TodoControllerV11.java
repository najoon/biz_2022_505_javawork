package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.inputService;
import com.callor.todo.service.impl.TodoServiceImplV1;
import com.callor.todo.service.impl.inputServiceImplV1;

public class TodoControllerV11 {
	public static void main(String[] args) {
		TodoService toService = new TodoServiceImplV1();
		inputService inService = new inputServiceImplV1();

		while (true) {
			Integer menu = inService.menu();
			if (menu == null) {
				System.out.println("업무번호를 잘 선택");
				continue;
			}
			if (menu == 5) {
				break;

			} else if (menu == 1) {
				String content = inService.inputContent();
				toService.todoInsert(content);

			} else if (menu == 2) {

				List<TodoVO> todoList = toService.todoSelectAll();
				for (TodoVO vo : todoList) {
					System.out.println(vo.toString());
				}
			}

		}
		System.out.println("업무종료");
	}
}
