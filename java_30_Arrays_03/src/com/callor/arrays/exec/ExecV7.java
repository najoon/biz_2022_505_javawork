package com.callor.arrays.exec;

public class ExecV7 {
	 public static void main(String[] args) {
         int intNum = 0;
         int[] intNums = new int[100];
         int count = 0;
         
         
         for (int i = 0; i < intNums.length; i++) {
            intNums[i] = (int) (Math.random() * 100) + 1;
         }
         
         
         for (int i = 0; i < intNums.length; i++) {
            boolean bYes = intNums[i] % 2 == 0;
            if (bYes) {
               intNum = intNums[i];
               System.out.printf("%d, \t", intNum);
               count++;
               if(count % 5 == 0) {
                  System.out.println();
               }
            }
         }
   }
}