package scope;

public class ScopeDemo2 {
	static int i;

	static void a() {
		i = 0;
	}
	public static void main(String[] args) {
		for (i = 0;  i < 5; i++) {
			a(); // 0이 무한반복 (*왜 demo1과 다른지?)
				 // i가 4번째 줄에서 선언 (다른 메소드가 아닌 클래스 자체에 선언-전역변수)
			     // 여기서 7 or 10 에서 int i를 선언해주면 demo1과 같은 값 산출
				 // why? 전역변수 i(4번째줄)의 값과 전혀 무관한 값이 됨 (중괄호{}기준)
			System.out.println(i);
		}
	}
}

