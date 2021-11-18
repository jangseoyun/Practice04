package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
	//01. 오류 수정
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;  

		int result = 0;
		
		for(int i = 0; i<intArray.length; i++) { //i<=intArray.length; 선언한 크기보다 크기 때문에 초과로 변경.
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
