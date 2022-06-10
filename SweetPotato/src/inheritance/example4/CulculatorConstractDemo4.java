package inheritance.example4;
// inheritance.example1 - CalculatorDemo1 �� ����
// 23~25��, 36�� ����Ǿ���

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
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

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		this.left = left; 
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CulculatorConstractDemo4 {
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		
		c1.sum();
		c1.avg();
		c1.substract();

	}
}

