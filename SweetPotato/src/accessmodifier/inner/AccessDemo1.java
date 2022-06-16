package accessmodifier.inner;
//접근제어자에 대하여

class A {
	// public : 누구든 사용가능한 메소드
	public String y() {
		return "public void z()";
	}
	// private : 클래스 내부(A)에선 사용가능. 외부(AccessDemo1)에선 사용x
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}

public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		
		// private 메소드의 외부 사용 불가
		// System.out.println(a.z());
		
		// x()는 A에 속해있기에 private 메소드(z()) 호출o
		// private =  접근제어자
		System.out.println(a.x());
	}
}
		// 접근제어자를 사용하는 이유?
		/* [은행의 창구: public / 금고:private] 이라 이해하면 용이!
		    이는 [은행]이란 시스템을 보호하기 위함 */
		/* 본 예제에서의 역할은 아래와 같다
		   고객: AccessDemo1 / 창구: classA의 y(), x() / 금고: private */
