package overloading.example1;

class Calculator{
	int left, right;
	int third = 0; // ����ġ �� �� ������ ���̱� ���� =0���� ����.
				   // ������ int left, right, third ; �� �ص� ����.
				   // �� ���� ��� =0���� �����ϴ� �͵� ���� ���
	
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right;
	}
	
	// �� setOprands �� �̸��� �������� �浹�߻� x 
	// why? ���� �̸��̾ [�ٸ� �Ű�����]�� ���� �ٸ� �޼ҵ�� �ν� (overloarding)
	public void setOprands(int left, int right, int third) {
		this.setOprands(left, right); // �ߺ� �ڵ带 ���̱� ����
		this.third = third;
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		if(this.third!=0) {
		System.out.println((this.left + this.right + this.third)/3);
		} else {
			System.out.println((this.left + this.right)/2);
		}
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();

	}
}
