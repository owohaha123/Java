package io;

import java.io.*;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) { 
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e){ // 객체지향에서 다시!
			e.printStackTrace();
		}
	}
}
