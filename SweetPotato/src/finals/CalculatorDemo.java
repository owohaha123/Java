package finals;
// Classninstance.Calculator ����

// class�� final�� ������ ���, �ٸ� Ŭ�������� �̸� ����� �� ����
class Calculator{
	// final�� PI�� ����
	// final <-> abstract
	static final double PI = 3.14;
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6; <-����
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI);
	}
}
