package inheritance.example1;
// object - CalculatorDemo4 참고

// 부모클래스 Calculator
class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		//this.left는 4번째줄 left를 , left는 6번째줄 left(매개변수)를 가르킴
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

// 자식클래스 SubstractionableCalculator
// SubstractionableCalculator 는 Calculator 를 [extends-상속,확장]한다.
class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
	}
}
