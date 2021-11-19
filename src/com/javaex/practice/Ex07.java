package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//07. 스캐너를 통해서 50000원권, 10000원권, 5000원권, 1000원권, 
	//500원동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요
	
		Scanner sc = new Scanner(System.in);
		
		/*int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;*/
		
		int[] wonArray1 = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10,5,1};
		int[] wonArray2 = new int[10]; //새로운 방 생성
				
		System.out.print("금액: ");
		int pocket = sc.nextInt(); // 주머니에 돈 들어옴

	
			for(int i = 0; i<wonArray1.length; i++) {
				wonArray2[i] = pocket/wonArray1[i]; //[i]번째 개수 ---> 받은 금액 / wonArray[i]
				pocket = pocket % wonArray1[i]; // 나머지 돈 ---> 나머지 돈 주머니에 넣는다 다시 실행되면서 반복됨
				System.out.println(wonArray1[i] + "원:"+wonArray2[i]+"개");
				
				}
				
	
		sc.close();
		

	}

}
