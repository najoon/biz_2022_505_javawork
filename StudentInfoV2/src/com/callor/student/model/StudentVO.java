package com.callor.student.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentVO {
	//1
	private String num;
	private String name;
	private String dept;
	private int grade;
	private String tel;
	

}
