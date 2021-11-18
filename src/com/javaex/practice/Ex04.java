package com.javaex.practice;

public class Ex04 {
//못함 
	public static void main(String[] args) {
	//04. 배열 데이터를 이용하여, 3의 배수의 1)개수 2)배수의 합 출력
	//int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

//		int[] data = new int[13];
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int ball = 0;
		
		for(int i = 0; i<=12; i++) {
			
			if(data[i]/3==0) {
				ball = ball + data[i];
				System.out.println(ball);
			}
			System.out.println();
		}
				
			
		
		
		

	}
}