package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec05 {

	public static void main(String[] args) {

		List<AddressVO> addrs = new ArrayList<>();
		AddressVO aVO = new AddressVO();
		aVO.setName("나준희");
		aVO.setAge(30);
		addrs.add(aVO);

		addrs.add(AddressVO.builder().name("홍길동").age(20).build());
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());

		addrs.add(new AddressVO());
		int size = addrs.size();
		addrs.get(size - 1).setName("임꺽정");
		addrs.get(size - 1).setAge(40);

		size = addrs.size();

		// 이름 순서로 오름차순 정렬

		System.out.println(Line.dLine(50));
		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		System.out.println(Line.dLine(50));
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0) {
					AddressVO _name = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, _name);
				}

			}

		}

		for (AddressVO str : addrs) {
			System.out.println(str.toString());
		}
	}

}
