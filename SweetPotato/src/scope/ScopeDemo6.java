package scope;

public class ScopeDemo6 {
		static int i = 5; // ��������

		static void a() {
			int i = 10; // ��������
			b();
		}
		static void b() {
			System.out.println(i); // ���������� �ҷ���
		}
		
		public static void main(String[] args) {
			a();
		}
	}
	// �� ������� 5�� ����
	// why? ��� i ���� �ҷ������� �׽�Ʈ�� ���� �˾ƺ��� ��
	/* 1) 14~15 ���̿� int i �� ���� (main)
	   2) 10~11 ���̿� int i �� ���� (b())
	   ---���� ���, 2�� ��ȿ! (b()���� 4��°���� ���������� ����-������ ��ȿ����)*/