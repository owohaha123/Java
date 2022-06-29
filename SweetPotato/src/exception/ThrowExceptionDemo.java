package exception;
// ���� �罽?

//���� ���������� ������ : [B -> C -> ThrowExceptionDemo -> �Ϲݻ����]
//�� ��, B�� C��, C�� ���θ޼ҵ�� ������ å���� throw(����)�� �� �ִ�.

// B(CheckExceptionDemo�� ����)���� C��, C���� ���θ޼ҵ�� ���ܸ� �佺�ϸ� �Ʒ��� ����.

import java.io.*;

class B{
	void run() throws FileNotFoundException,IOException { // throws �Ͽ� FileNotFoundException,IOException ����
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C{
	void run() throws FileNotFoundException,IOException { // �� �� �� �佺
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
			System.out.println("out.txt ������ �ʿ��մϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
