package com.daily.joon;

public class ControllerV12 {
	public static void main(String[] args) {
        int count;
        int allCount = 0;
        for (int i = 2; i <= 1000; i++) { 
            count = 0;
            for (int j = 2; j < i; j++) { // j는 나누는 수
                if (i % j == 0)  // 나머지가 0이란건 소수가 아니라는 것.
                    count++;  //count가 올라갔다는건 소수가 아니라는것.
            }
                if (count == 0)  
                    allCount++;
            }

        System.out.println(allCount);
    }}


		
