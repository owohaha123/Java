package variables;

public class Variables {

	public static void main(String[] args) {
		int a; //���� int(-20��~20��)
		//�� �� �����Լ�: byte(-128~127), short(-32,768~32,767), long(-1000��~1000��)
		// �޸� ��뷮�� ���� ���� ����
		a = 1;
		System.out.println(a+1); //2
		a = 2;
		System.out.println(a+1); //3
		
		
		double b; //�Ǽ�
		// �� �� �Ǽ��Լ�: float (<-���� ����� �� ����)
		b = 1.1;
		System.out.println(b+1.1); //2.2
		double c;
		c = 3;
		System.out.println(c+1.1); //4.1 �Ǳ� ��^^
		
	}

}
