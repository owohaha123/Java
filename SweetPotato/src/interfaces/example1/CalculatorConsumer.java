package interfaces.example1;

// 가짜클래스 CalculatorDummy 생성하여 임시 사용
// Calculatable이라는 인터페이스를 implements(구현)하여 예외적 상황이나 오류를 감소 (규격지정)
class CalculatorDummy implements Calculatable{
	public void setOperands (int first, int second, int third){}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}
public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy(); // 개발이 완료되었다면 이 줄에서 Dummy만 지우고 실행하면 ㅇㅋ
		c.setOperands(10,20,30);
		System.out.println(c.sum()+c.avg());
	}
}
