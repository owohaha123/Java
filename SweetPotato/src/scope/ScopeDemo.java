package scope;

public class ScopeDemo {

	static void a() {
		int i = 0;
	}
	public static void main(String[] args) {
		for (int i = 0;  i < 5; i++) {
			a(); // 6��° �ٿ��� i=0 �����ߴµ� ���� �� ���� ����? (��� 0 ���;� �ϴ� �� �Ƴ�?)
				 // 6��° �ٿ��� ����� i�� a��� �޼ҵ� �ȿ����� ��ȿ�ϱ⿡ �ܺο� ����x (��ȿ����-scope)
			     // ������
			System.out.println(i);
		}
	}
}
