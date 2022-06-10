package scope;

public class ScopeDemo {

	static void a() {
		int i = 0;
	}
	public static void main(String[] args) {
		for (int i = 0;  i < 5; i++) {
			a(); // 6번째 줄에서 i=0 선언했는데 오류 안 나는 이유? (계속 0 나와야 하는 거 아냐?)
				 // 6번째 줄에서 선언된 i는 a라는 메소드 안에서만 유효하기에 외부에 영향x (유효범위-scope)
			     // 지변수
			System.out.println(i);
		}
	}
}
