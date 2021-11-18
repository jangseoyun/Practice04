package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
	//03. 아래코드의 출력값을 예상하고 코드로 확인해 보세요
		//20 6 10 intA 3, 6, 9값 선언 > 이후 intA = intB 선언 따라서 intA[0]=20, intA[1]=6, intA[2]=10
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i = 0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}
