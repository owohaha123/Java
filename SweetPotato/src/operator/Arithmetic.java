package operator;

public class Arithmetic {

	public static void main(String[] args) {
		
		// result �� ���� 3
		int result = 1 + 2;
		System.out.println(result);
		
		// result �� ���� 2
		result = result - 1;
		System.out.println(result);

		// result �� ���� 4
		result = result * 2;
		System.out.println(result);
		
		// result �� ���� 2
		result = result / 2;
		System.out.println(result);
		
		// result �� ���� 10
		result = result + 8;
		System.out.println(result);
		
		// result �� ���� 3
		result = result % 7; //(10�� 7�� ���� ������)
		System.out.println(result);
		
		//-------------------------------
		int a = 3;
		// %�� �� ���� ��ȯ ���� ���� �� ���� ������
		System.out.println(0%a); //0
		System.out.println(1%a); //1
		System.out.println(2%a); //2
		System.out.println(3%a); //0
		System.out.println(4%a); //1
		System.out.println(5%a); //2
		System.out.println(6%a); //0


		
	}

}
