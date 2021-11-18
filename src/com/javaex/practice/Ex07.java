package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//07. 스캐너를 통해서 50000원권, 10000원권, 5000원권, 1000원권, 
	//500원동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요
	//정말 모르겠어욤... 하휴ㅠㅠㅠㅠ 종이였으면 너덜너덜 해졌음..
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액: ");
		int input = sc.nextInt();
		
		for(int i = 0; i<10; i++) {
			
		}

		sc.close();
		

		
	}

}
