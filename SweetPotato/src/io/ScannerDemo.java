package io;

import java.util.Scanner;// ��Ű�� �о�(import)���� ��- ���߿� ����

public class ScannerDemo {
	// ���̺귯�� - Scanner (��ü���⿡ ���� ���ذ� �ʿ��ϱ⿡ ������ ���� ����)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in - ����ڰ� �Է��� ��. ���⿡ ���� ���� ����
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
