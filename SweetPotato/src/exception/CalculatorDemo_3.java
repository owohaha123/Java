package exception;
//exception CalculatorDemo_2 ����

class DivideException extends RuntimeException{ // �̰�(unchecked)�� �ƴ� Exception�� ��ӹ��� ���, ����ó���� ����� ��
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
class Calculator3{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new DivideException("0���� ���� �� �����ϴ�.");
		}
			System.out.print("������� ");
			System.out.print(this.left/this.right); 
			System.out.print(" �Դϴ�.");
	}
}

public class CalculatorDemo_3 {
	public static void main(String[] args) {
		Calculator3 c3 = new Calculator3();
		c3.setOprands(10, 0); 
		try{
			c3.divide(); 
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
