package exception;
// exception CalculatorDemo_1 �� ���� �߰�

class Calculator2{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new ArithmeticException("0���� ���� �� �����ϴ�.");
		}
		try { 
			System.out.print("������� ");
			System.out.print(this.left/this.right); 
			System.out.print(" �Դϴ�.");
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e. getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo_2 {
	public static void main(String[] args) {
		Calculator2 c2 = new Calculator2();
		c2.setOprands(10, 0); 
		try{
			c2.divide(); 
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}

// 1) IligalAgumentException : ���ڷ� ���޵� ���� ����x (�и� 0�� ������)
// 2) IligalStateException : �޼ҵ��� ���ۻ�Ȳ�� �������� �ʾ� ����Ұ��� ��
// 3) NullPointerException : �Ű������� null �� ��
// 4) IndexOutOfBoundsException : �ε��� �Ű����� ���� ������ ��� ��
// 5) ArithmeticException : ����� ������ ���� ��