package constructor;

class Calculator{
	int left, right;
	
	// Ŭ����(3��°��)�� ������ �̸����� ����
	public Calculator (int left, int right) { 
		this.left = left; 
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10, 20); // Ŭ������ �ƴ� �����ڰ� �ҷ�������.
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}
}

	// Calculator�� �޼ҵ�(7��°��)�� �����ΰ�? ������(constructor)
	// �������� ����: Ŭ������ ���� �̸��� ���� �޼ҵ�(������)�� �� � �޼ҵ庸�� �켱 ����!(�ʱ�ȭ �۾�)
	// ���� �켱������ Ŭ���� < ������