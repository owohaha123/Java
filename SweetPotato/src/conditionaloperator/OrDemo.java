package conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		// ||=or (�� �� �ϳ��� ���̸� ����)
		if (true || true) {
			System.out.println(1);
		}//����o
		
		if (true || false) {
			System.out.println(2);
		}//����o
		
		if (false || true) {
			System.out.println(3);
		}//����o
		
		if (false || false) {
			System.out.println(4);
		}//����x

	}

}
