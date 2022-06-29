package exception;
// exception CalculatorDemo_1 에 예외 추가

class Calculator2{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		try { 
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right); 
			System.out.print(" 입니다.");
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

// 1) IligalAgumentException : 인자로 전달된 값이 적합x (분모가 0인 나눗셈)
// 2) IligalStateException : 메소드의 동작상황이 충족되지 않아 실행불가할 때
// 3) NullPointerException : 매개변수가 null 일 때
// 4) IndexOutOfBoundsException : 인덱스 매개변수 값이 범위를 벗어날 때
// 5) ArithmeticException : 산술적 오류가 있을 때