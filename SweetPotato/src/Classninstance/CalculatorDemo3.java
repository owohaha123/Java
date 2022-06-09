package Classninstance;
//클래스 메소드

class Calculator3 {

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}

}

public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		// 인스턴스x, 클래스를 직접 접근하여 sum avg 호출
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}
}