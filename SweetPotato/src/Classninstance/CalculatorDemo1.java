package Classninstance;

class Calculator{
	static double PI = 3.14;
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left; //= 전역변수 left(5번째줄)는 지역변수 left(7번째줄)의 값이다
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		//c1,c2라는 인스턴스에 접근하여 답을 구함
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		// 인스턴스 뿐 아니라 클래스에 직접 접근하여 답을 구할 수도 있음
		System.out.println(Calculator.PI);
	}
}
