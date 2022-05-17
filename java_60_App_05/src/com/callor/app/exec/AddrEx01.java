package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class AddrEx01 {
	
public static void main(String[] args) {
	
	/*
	 * AddressVO 클래스를 사용하여 3개의 객체 인스턴스 생성
	 * 동일한 클래스를 사용하여 생성하였지만
	 * 각각의 객체는 완전히 독립된 상태이다
	 * 특별하게 일부러 코드를 작성하지 않는한
	 * 각각의 객체는 서로에게 영향을 미치지 않는다
	 * 
	 * 데이터를 저장할때 VO 클래스를 선언하고 객체를 만드는 이유
	 * 주소록 관리 애플리케이션을 만든다고 하면 
	 * 각각 주소데이터에는 이름,주소,전화번호,나이,취미 등이 필요할 것이다
	 * 이 데이터들을 개별적인 변수로 선언을 하여 사용할수 있다
	 * 또는 각각의 배열로 선언하여 사용할수 도 있다.
	 * 
	 * 개별적인 변수로 선언을 하거나, 배열로 선언을 하게 되면
	 * 이름 - 주소 - 전화번호 - 나이 - 취미 등의 데이터 연결이 
	 * 매우 불편하게 될 수 있다
	 * 경우에 따라서는 서로 완전히 다른 데이터가 저장되거나
	 * 출력 될수 있다
	 * 
	 * 객체지향에서는 이러한 개별적인 변수들을 하나의 클래스로 묶고
	 * 클래스를 사용하여 객체를 생성하면
	 * 객체와 함께 묶음으로 데이터를 관리할수 있기 때문에
	 * 데이터가 서로 다른 값이 저장되는 것을 발지 할수 있다.
	 * 어떤 연산을 하기 위해서 method 에 매개변수로 전달하거나
	 * 연산 결과를 return 할때고 객체 단위로 이동이 가능하다.
	 * 
	 * */
	AddressVO hong = new AddressVO();
	AddressVO lee  = new AddressVO();
	AddressVO sung  = new AddressVO();
	
	hong.setName("나준희");
	hong.setAge(28);
	hong.setHabby("운동");
	hong.setTel("010-0000-0000");
	hong.setAddr("광주시 북구");
	
	lee.setName("홍길동");
	lee.setAge(30);
	lee.setHabby("독서");
	lee.setTel("010-0011-1111");
	lee.setAddr("전북");
	
	sung.setName("성춘향");
	sung.setAge(22);
	sung.setHabby("영화감상");
	sung.setTel("010-0011-0000");
	sung.setAddr("서울");
	
	System.out.println(hong);
	System.out.println(lee);
	System.out.println(sung);
}

}
