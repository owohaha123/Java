package io;

import java.util.Scanner;// 패키지 읽어(import)오는 중- 나중에 설명

public class ScannerDemo {
	// 라이브러리 - Scanner (객체지향에 대한 이해가 필요하기에 지금은 보고만 가기)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in - 사용자가 입력한 값. 여기에 파일 넣을 예정
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
