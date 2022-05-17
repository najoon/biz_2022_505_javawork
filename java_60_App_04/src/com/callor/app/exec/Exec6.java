package com.callor.app.exec;

public class Exec6 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 91) + 10;
		}
		for (int j = 0; j < nums.length; j++) {
			int index = 0;
			int count = 0;
			// nums[j] 값이 9라고 했을 때
			// 2~8까지 반복실행된다
			for (index = 2; index < nums[j]; index++) {
				// 9 % 2 는 나머지가 1,9 % 3 은 나머지가 0이 된다
				// 9% 3 이 0이 되는 순간 break 를 만나서 for 가 중단
				if (nums[j] % index == 0) {
					break;
				}
				
			}
			// break 를 만나지 않았을때는
			//nums[j] 값과 index 값이 같다
			// index 값이 같거나 큰가 비교해본다
			// true 가 된다는 것은 break 를 만나지 않았다는 것이다
			if(nums[j] <= index) {
				System.out.println(nums[j] + "는 소수");
			} else {
				System.out.println(nums[j]+" 는 소수가 아님");
			}
		}
	}

}
