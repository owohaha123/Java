package scope;

class C {
	int v = 10;
	
	void m() {
		// int v = 20; (<-이 경우, 20이 산출 -지역변수가 우선)
		// 위와 같이 변수 중첩 시의 장점은 해당 메소드(m())에만 별도로 영향주는게 가능
		System.out.println(v);
		// 근데 해당 메소드 안에서 전역변수(10)의 값도 얻고싶다면?
		// System.out.println(this.v); 입력하면 됨 (산출= 20,10)
		// this는 인스턴스 자신을 의미(여기선 전역의 의미를 가짐)
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}

	// 절차지향 프로그래밍에서는 전역변수의 사용을 금기시 함 (오류발생률)
	// 객체지향 프로그래밍에선 메소드를 통해 유효범위를 제한할 수 있기에 비교적 자유! (그래도 남발은 ㄴㄴ)