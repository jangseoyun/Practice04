package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	//05. 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		float ball = 0f;
		
		for(int i = 0; i<5; i++) {
			num[i] = sc.nextInt();
			ball = ball+num[i];
		}
		
		System.out.println("평균은 "+(ball/5)+" 입니다.");

		sc.close();
	}

}
