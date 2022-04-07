package com.daily.joon;

import com.najoon.service.Service_01;
import com.najoon.service.Service_02;

public class ControllerV1 {
	public static void main(String[] args) {
		Service_01 service = new Service_01();
		
		service.guguDan();
		System.out.println("\n============================");
		service.guguDan(8);
		Service_02 service_02 = new Service_02();
		service_02.num();
		System.out.printf("\n%d",service_02.num());

	}

}
