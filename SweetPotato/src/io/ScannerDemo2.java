package io;

import java.util.Scanner;

public class ScannerDemo2 {
	// Demo1 �� �޸� �絿�� ���� �Է����ڸ��� ���
	// while �ݺ��� �̿�!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { //Int- �Է°��� ���� ���� ���� ��� sc.close();�� ���� ���� 
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();// ���� �Է� �� ���α׷� ����
	}

}
