package io;

import java.util.Scanner;

public class ScannerDemo2 {
	// Demo1 과 달리 재동작 없이 입력하자마자 출력
	// while 반복문 이용!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { //Int- 입력값이 정수 외의 값일 경우 sc.close();에 의해 종료 
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();// 문자 입력 시 프로그램 종료
	}

}
