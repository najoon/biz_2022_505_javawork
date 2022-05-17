package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx4 {
	
	public static void main(String[] args) {
		/*
		 * List : interface, 데이토 그룹을 저장하기 위한 type
		 * Collections type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List 를 선언할때는 Generic type 을 지정한다
		 * 1. List 에 add 하는 데이터를 제한하여
		 * 잘못된 데이터가 add 되는 것을 방지하기 위함
		 * 2. 메모리 낭비를 막고 성능상 잇점이 있기 때문에
		 * 아래 선언된 List 는 Generic type 이 AddressVO 이다
		 * 여기 List 에 데이터를 추가하려면 먼저 AddressVO type 의
		 * vo 객체를 만들고, 데이터를 저장한다음 add 한다
		 */
		List<AddressVO> list = new ArrayList<>();
		
		AddressVO addr = new AddressVO();
		addr.setName("나준희");
		addr.setAge(28);
		addr.setTel("010-8109-2558");
		list.add(addr);
		
		/*
		 * vo 데이터를 List 에 add 하기 위해서는 
		 * 항상 새로운 VO를 생성하고 데이터를 setting 하고 add 해야한다.
		 */
		addr = new AddressVO();
		addr.setName("성춘향");
		addr.setAge(25);
		addr.setTel("010-000-0000");
		list.add(addr);
		
		addr = new AddressVO();
		addr.setName("ㄴㄴㄴ");
		addr.setAge(00);
		addr.setTel("0000-000-0000");
		list.add(addr);
		
		AddrServiceV1 addrServiceV1 = new AddrServiceV1();
		addrServiceV1.printAddrList(list);
	}
}
