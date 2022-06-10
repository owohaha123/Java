package constructor;

class Calculator{
	int left, right;
	
	// 클래스(3번째줄)와 동일한 이름으로 생성
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
		
		Calculator c1 = new Calculator(10, 20); // 클래스가 아닌 생성자가 불러와진다.
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}
}

	// Calculator란 메소드(7번째줄)는 무엇인가? 생성자(constructor)
	// 생성자의 역할: 클래스와 같은 이름을 가진 메소드(생성자)가 그 어떤 메소드보다 우선 실행!(초기화 작업)
	// 따라서 우선순위는 클래스 < 생성자