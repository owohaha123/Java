package operator;

public class PrepostDemo {

	public static void main(String[] args) {
		
		int i = 3;
		++i; //���������� ()�ȿ��� ���� ��
		System.out.println(i); //4���
		System.out.println(++i); //5���
		System.out.println(++i); //6���

		System.out.println(i++); //6���
		System.out.println(i++); //7���
		System.out.println(i); //8���

		i++; // ���������� ()���� �����ٿ� ����� ����
		System.out.println(i); //9���
		System.out.println(i++); //9���
		System.out.println(i++); //10���
		System.out.println(i); //11���

		System.out.println(++i); //12���
		System.out.println(++i); //13���
	}

}
