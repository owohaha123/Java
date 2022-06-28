package exception;
// try catch �� ����ó��

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		// ������� ������ �߻��߽��ϴ�/ by zero
		try { // 3) try catch �� �̿��Ͽ� ���ܸ� ó��
		System.out.print("������� ");
		System.out.print(this.left/this.right); // <- 2)�����߻�, �����ڵ� ���� x
		System.out.print(" �Դϴ�.");
		} catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ�" + e. getMessage());
		}
		System.out.println("Divide End");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0); 
		c1.divide(); // <- 1)�����߻� (�и� 0�� �� ������ �߻��ϵ��� ��ġ�Ǿ� ����)
	}
}

/* 
   try {
   	������ �߻��� ����Ǵ� ����
   }catch(����Ŭ���� �ν��Ͻ�) {
	���ܰ� �߻����� �� ����Ǵ� ����
   }
 */