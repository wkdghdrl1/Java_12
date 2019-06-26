package com.biz.exec;

public class FIbNumEx_01 {
	
	/*
	 * 피보나치 수열
	 * 앞에 나온 2개의 숫자를 더해서 다음 수를 만드는 수열
	 * 1 2 3 5 8 ...34 순서로 이어지는 수열
	 */
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 변수의 값을 이동시키는 것
		for(int i = 0 ; i < 15;  i++) {
			int fNum = num1 + num2;
			System.out.println(fNum);
			
			num1 = num2;
			num2 = fNum;
		}
		
	}

}
