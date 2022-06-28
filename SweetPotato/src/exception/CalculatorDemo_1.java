package exception;
//exception_Calculator 의 구체적 뒷수습

class Calculator1{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
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

public class CalculatorDemo_1 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 0); 
		c1.divide(); 
	}
}