package method;

public class ReturnDemo2 {
	
	public static String num(int i) {  //i�� 1�� ��
		if(i==0) {
			return "zero"; // i�� 0�� �ƴϹǷ� false ����
			// return�� ������ ���ܾ� ������ false �����̹Ƿ� �ش� return ���� x
		} else if (i==1) { 
			return "one"; // ���ǿ� �´� �� ���� ����
		} else if (i==2) {
			return "two";	
		}
		return "none";
	}

	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
