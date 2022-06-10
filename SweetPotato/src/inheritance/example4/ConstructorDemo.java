package inheritance.example4;

public class ConstructorDemo {
	
	// public ConstructorDemo(int param1) {} <- 이거 넣으면 오류
	// why? 매개변수(int param1)가 있기 때문
	// 대신 상단에 public ConstructorDemo(){} 를 추가하면 유효

	public static void main(String[] args) {
		
		// 기본생성자 - class와 동일한 이름이면서 매개변수가 없는 메소드
		ConstructorDemo C = new ConstructorDemo(); // <- 기본생성자
		
	}

}
