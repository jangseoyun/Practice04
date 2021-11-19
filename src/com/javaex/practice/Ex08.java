package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
	//08. 배열, 1~45까지의 숫자 중 임의의 6개 숫자 출력 (중복 체크)
		
		int[] intArray = new int[6];
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = ((int)(Math.random()*45))+1;
			if(intArray[i]==intArray[i]) {
				continue;
			}
		}

		for(int i = 0; i<intArray.length; i++) {	
			
				System.out.println(intArray[i]);

		}

	}

}
