package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	
	public static void main(String[] args) {
		AddressVO hong = AddressVO.builder()
						.name("홍길동")
						.tel("010-0000-000")
						.addr("서울")
						.build();
		
		AddrServiceV1 addService = new AddrServiceV1();
		/*
		 * printAddr() method는 AddressVO type 의 매개변수를 갖고잇다
		 * 특별히 return 은 없다
		 */
		addService.printAddr(hong);
	}
	

}
