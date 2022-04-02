package com.joon.Var01;

public class MyMac01 {
	
	public static void main(String[] args) {
		System.out.println("안녕,맥처음");
		double doNum1 = 0.0;
		double doNum2 = 0.0;
		boolean intNum1 =false;
		doNum1 = (int)(Math.random()*1000)+1;
		doNum2 = (int)(Math.random()*1000)+1;
		intNum1 = doNum1 > doNum2;
	if(intNum1) {
		System.out.println(doNum1 + "은" +doNum2 + "크다.");
	}else {
		System.out.println(doNum1 + "은" +doNum2 + "보다 작다");
	}
		
	}

}
