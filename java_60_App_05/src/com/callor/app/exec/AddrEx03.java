package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {
	
	public static void main(String[] args) {
		
		AddressVO[] hong = new AddressVO[3];
		for(int i = 0 ; i < hong.length ; i++) {
			hong[i] = new AddressVO();
		}
		hong[0].setName("나준희");
		hong[0].setAge(28);
		hong[0].setHabby("운동");
		
		hong[1].setName("ㅎㅇㅎㅇ");
		hong[1].setAge(25);
		hong[1].setHabby("영화");
		
		hong[2].setName("ㄴㄴㄴㄴ");
		hong[2].setAge(35);
		hong[2].setHabby("ㅁㅁㄴ");
	
		AddrServiceV1 addrService = new AddrServiceV1();
			addrService.printAddrList(hong);
	}
}
