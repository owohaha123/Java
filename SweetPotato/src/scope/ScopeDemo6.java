package scope;

public class ScopeDemo6 {
		static int i = 5; // 전역변수

		static void a() {
			int i = 10; // 지역변수
			b();
		}
		static void b() {
			System.out.println(i); // 전역변수를 불러옴
		}
		
		public static void main(String[] args) {
			a();
		}
	}
	// 위 결과값은 5가 나옴
	// why? 어느 i 값을 불러오는지 테스트를 통해 알아봐야 함
	/* 1) 14~15 사이에 int i 값 선언 (main)
	   2) 10~11 사이에 int i 값 선언 (b())
	   ---선언 결과, 2가 유효! (b()통해 4번째줄의 전역변수가 산출-정적인 유효범위)*/