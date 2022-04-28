package com.callor.app.primes;

public class Exec71 {
	
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length; i++) {
			int num = (int)(Math.random()*100)+2;
			nums[i] = num;
		}
		int count = 0;
		for(int num : nums) {
			int index = 0;
			for(index = 2 ; index < num ; index++){
				if(num % index == 0) {
					
					break;
				}
			}
			//for 가 break 를 만나면 index 값은 num 보다 항상 작다
			// index 값이 num 보다 작다는 것은 num 가 소수가 아니라는 것
			if(index >=  num) {
				count ++;
				
			}
		}
	}
	

}
