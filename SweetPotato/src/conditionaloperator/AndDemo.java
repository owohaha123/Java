package conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		// && = and
		if (true && true) {
			System.out.println(1);
		}//����o
		
		if (true && false) {
			System.out.println(2);
		}//����x (�� �� �ϳ��� ���ǿ� �� ������ �����)
		
		if (false && true) {
			System.out.println(3);
		}//����x
		
		if (false && false) {
			System.out.println(4);
		}//����x

	}

}
