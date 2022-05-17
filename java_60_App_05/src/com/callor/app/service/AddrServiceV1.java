package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO vo) {

		System.out.println(vo.toString());
		
	}
	//AddressVO 배열 type 의 매개변수 1개 받기
	// 배열의 개수만큼 AddressVO 가 전달된다
	public void printAddrList(AddressVO[] vo) {
		// 객체만 println() 에 전달하면
		// 내부에서 vo.toString() 을 호출하여 전달
		for(int i = 0; i < vo.length;i++) {
			System.out.println(vo.toString());
		}
	}
		public void printAddrList(List<AddressVO> vo) {
				System.out.println(vo);
			
		
	}

}
