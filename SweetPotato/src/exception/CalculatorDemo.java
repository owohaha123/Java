package exception;
// try catch 로 오류처리

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		// 계산결과는 오류가 발생했습니다/ by zero
		try { // 3) try catch 를 이용하여 예외를 처리
		System.out.print("계산결과는 ");
		System.out.print(this.left/this.right); // <- 2)오류발생, 다음코드 실행 x
		System.out.print(" 입니다.");
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다" + e. getMessage());
		}
		System.out.println("Divide End");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0); 
		c1.divide(); // <- 1)오류발생 (분모가 0일 시 오류가 발생하도록 장치되어 있음)
	}
}

/* 
   try {
   	예외의 발생이 예상되는 로직
   }catch(예외클래스 인스턴스) {
	예외가 발생했을 때 실행되는 로직
   }
 */