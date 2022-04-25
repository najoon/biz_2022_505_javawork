package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;



public class ListEx1 {
	
	public static void main(String[] args) {
		/*
		 * java 에서 배열을 대신하여 사용되는 자료형
		 * 여려가지 자료형 중에서 가장 많이 사용하는 구조
		 * List :interface
		 * 
		 */
		
		List<Integer> intList = new ArrayList<>();
		
		// 구현 클래스 만으로 객체를 선언하고 생성하는 코드를
		// 사용할수 있지만, interface 가 있는 경우는
		// interface 를 사용하여 객체를 선언하는 것이 좋다
		ArrayList<String> strList = new ArrayList<>();
		
		// List 형의 자료는 저장(추가) 할 데이터의 type 을 
		// Generic 으로 설정한다
		// Generic 으로 설정 할수 있는 type 은
		// 반드시 class type 이어야 한다
		// primitive type 은 Generic 으로 설정 할수 없다.
		List<Float> floatList = new ArrayList<>();
		
	}

}
