package scope;

public class ScopeDemo2 {
	static int i;

	static void a() {
		i = 0;
	}
	public static void main(String[] args) {
		for (i = 0;  i < 5; i++) {
			a(); // 0�� ���ѹݺ� (*�� demo1�� �ٸ���?)
				 // i�� 4��° �ٿ��� ���� (�ٸ� �޼ҵ尡 �ƴ� Ŭ���� ��ü�� ����-��������)
			     // ���⼭ 7 or 10 ���� int i�� �������ָ� demo1�� ���� �� ����
				 // why? �������� i(4��°��)�� ���� ���� ������ ���� �� (�߰�ȣ{}����)
			System.out.println(i);
		}
	}
}

