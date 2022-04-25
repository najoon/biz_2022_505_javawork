package com.callor.app.service;

import java.util.List;

public class ServiceV2 {
	
	private final List<Integer> intList;
	
	public ServiceV2(List<Integer> intList) {
		this.intList = intList;
		
		
	}
	
	/*
	 * length 변수를 매개변수 받아서
	 * length 개수 많큼의 random 수를 저장한 
	 * intList 를 return 한다.
	 */
	public List<Integer> getScore(int length){
		for(int i = 0 ; i < length ; i++) {
			int rnd = (int)(Math.random()*100)+1;
			intList.add(rnd);
			
		}
		return intList;
	}
}
