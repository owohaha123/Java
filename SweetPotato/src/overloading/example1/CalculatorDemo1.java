package overloading.example1;

class Calculator{
	int left, right;
	int third = 0; // 예기치 못 한 오류를 줄이기 위해 =0으로 선언.
				   // 당장은 int left, right, third ; 로 해도 무방.
				   // 세 변수 모두 =0으로 선언하는 것도 좋은 방법
	
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right;
	}
	
	// 위 setOprands 와 이름이 같음에도 충돌발생 x 
	// why? 같은 이름이어도 [다른 매개변수]로 인해 다른 메소드로 인식 (overloarding)
	public void setOprands(int left, int right, int third) {
		this.setOprands(left, right); // 중복 코드를 줄이기 위함
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
