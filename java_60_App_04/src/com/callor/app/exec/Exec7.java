package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec7 {

	public static void main(String[] args) {
		int intNum = 7;
	System.out.println(Line.dLine(20));
	System.out.printf("%d 단 구구단\n" ,intNum);
	System.out.println(Line.sLine(20));
	for(int i = 2 ; i < 10 ; i++) {
		System.out.printf("7 X %d = %d \n" ,i,intNum * i);
		
	}
	
	}

}
