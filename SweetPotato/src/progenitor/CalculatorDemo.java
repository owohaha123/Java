package progenitor;

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
	public String toString() {
		return super.toString()+  "left:"+this.left+", right:"+this.right; // <-toString overriding
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		System.out.println(c1.toString()); // 변수 c1을 println. (= System.out.println(c1);)
										   // why? class Calculator가 object란 클래스를 extends한 격
										   //  	   따라서 object 속에 정의된 메소드 사용가능
										   //      고로 overriding 또한 가능!
	}
}
