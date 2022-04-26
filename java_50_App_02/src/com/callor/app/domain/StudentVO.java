package com.callor.app.domain;

/*
 * 클래스 정의 (class prototype define)
 * java 파일을 생성하고
 *  class 키워드를 시작으로 만든코드
 *  
 *  
 */
public class StudentVO {
	
	private String stNum;
	private String stName;
	private int intGrade;
	private String stDept;
	private String stAddr;
	private String stTel;
	
	
	/*
	 * VO 클래스에 기본생성자와 
	 * 모든 인스턴스변수(클래스영역의 변수)
	 * 매개변수로받아 초기화하는 임의 생성자를 만든다
	 * 
	 * jdk를 사룔하여 프로젝트를 수행할때
	 * 다양한 도구들을 연결할 필요가 있는데
	 * 도구들마다 vo 객체에 접긍하는 방법이 조금씩 다르다
	 * 
	 * 어떤 도구는 getter,setter 를 통하여 접근하기도 하고
	 * 어떤 도구는 필드 생성자를 톨하여 접근하기도 한다
	 * 
	 * 최근에는 getter, setter 를 만들지 말자라는 의견이 있지만
	 * 다양한 jdk 도구를 사용할때는 필요하기도 하므로
	 * 표준 java 코딩의 vo 클래스 작성 패턴에는
	 * 모든 변수는 private 으로 선언하고 getter,setter 를 정의해준다./
	 */
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param intGrade
	 * @param stDept
	 * @param stAddr
	 * @param stTel
	 */
	public StudentVO(String stNum, String stName, int intGrade, String stDept, String stAddr, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.stTel = stTel;
	}



	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	public String getStDept() {
		return stDept;
	}
	
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	
	//vo 객체에 데이터를 저장한 후
	// 저장된 데이터가 잘 담겼는지 확인하는 용도로 사용하기 위하여
	//toString() 메서드를 재 정의 한다
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", stTel=" + stTel + "]";
	}
	

}
