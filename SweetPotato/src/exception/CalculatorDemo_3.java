package exception;
//exception CalculatorDemo_2 변형

class DivideException extends RuntimeException{ // 이것(unchecked)이 아닌 Exception을 상속받을 경우, 예외처리를 해줘야 함
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
			throw new DivideException("0으로 나눌 수 없습니다.");
		}
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right); 
			System.out.print(" 입니다.");
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
