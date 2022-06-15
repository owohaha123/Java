package overriding.example1;
//inheritance.example1.Calculator; 참고


class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	
	public int avg() {
		return((this.left + this.right)/2);
	}
}

class SubstractionableCalculator extends Calculator {
	// 부모클래스에서 정의된 sum, 자식클래스에서 재정의 (이 때, 재정의 된 값이 산출)

	public void sum() {
		System.out.println("실행 결과는" + (this.left + this.right) +"입니다.");
	}

	// 재정의 시, 부모클래스와 [return(데이터)타입, 메소드명(avg), 매개변수]가 같아야 함 (='메소드의 서명' 일치)
	// 따라서 부모클래스를 자식클래스와 맞는 타입으로 바꿔주면 ㅇㅋ (원하는 값이 자식클래스-int 형식이기 때문)
	// 좋은 예제는 아님 (why? 부모클 말고 자식클의 변형을 통해 원하는 결과를 얻는 것이 목적이기 때문)
	/* 해당 예제는 부모클래스와 중복. 무게를 줄이려면 아래와 같이 변경! (super.사용)
	   public int avg() {
	      return super.avg()
	   }*/
	public int avg() {
		return((this.left + this.right)/2);
	}
	
	
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