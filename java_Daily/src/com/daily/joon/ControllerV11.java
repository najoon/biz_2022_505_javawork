package com.daily.joon;

import com.najoon.service.ServiceV10;

public class ControllerV11 {
	public static void main(String[] args) {
		ServiceV10 serviceV10 =new ServiceV10();
		int intResult = serviceV10.input();
		if(intResult < 0) {
			System.out.println("입력을 종료");
		}else {
			System.out.println("입력을 모두 완료");
		}
		
	}
}


		
