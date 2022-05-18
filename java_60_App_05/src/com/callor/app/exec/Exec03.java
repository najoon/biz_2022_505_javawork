package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec03 {

	public static void main(String[] args) {

		List<AddressVO> addrs = new ArrayList<>();
		AddressVO aVO = new AddressVO();
		aVO.setName("나준희");
		aVO.setAge(30);
		addrs.add(aVO);

		addrs.add(AddressVO.builder().name("홍길동").age(20).build());
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());

		// 요소데이터가 아직 공백 객체를 list 에 추가하고
		// 추가된 위치는 전체리스트 size -1번 위치가 된다
		addrs.add(new AddressVO());
		// 리스트의 size 값을 확인하고
		int size = addrs.size();
		// 마지막의 추가된 데이터의 위치는 size -1 이다
		// size -1 위치의 객체에 요소 값들을 setting
		addrs.get(size - 1).setName("임꺽정");
		addrs.get(size - 1).setAge(40);

		for (AddressVO vo : addrs) {
			System.out.println(aVO.toString());
		}
		size = addrs.size();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// list.get(위치) 형식으로 vo 를 추출하고
				// 각 요소 변수를 getter
				// list.get(위치).getAge()
				if (addrs.get(i).getAge() > addrs.get(j).getAge()) {

					AddressVO _tVO = addrs.get(i);

					addrs.set(i, addrs.get(j));
					addrs.set(j, _tVO);
				}
			}
		}
		System.out.println(Line.dLine(50));
		for(AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
	}

}
