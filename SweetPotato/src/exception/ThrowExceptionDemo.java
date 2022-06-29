package exception;
// 예외 사슬?

//현재 로직에서의 사용관계 : [B -> C -> ThrowExceptionDemo -> 일반사용자]
//이 때, B는 C에, C는 메인메소드로 예외의 책임을 throw(전가)할 수 있다.

// B(CheckExceptionDemo가 원형)에서 C로, C에서 메인메소드로 예외를 토스하면 아래와 같다.

import java.io.*;

class B{
	void run() throws FileNotFoundException,IOException { // throws 하여 FileNotFoundException,IOException 전가
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C{
	void run() throws FileNotFoundException,IOException { // 한 번 더 토스
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
