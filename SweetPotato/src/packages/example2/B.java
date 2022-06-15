package packages.example2;
// packages.example1의 class를 전부 로드함 (.*)
// 일반적으로 프로그래밍에서 [*]는 [모든 것]이라는 의미로 쓰임
import packages.example1.*; 

// packages.example1의 특정 class(A)만 로드함
//import packages.example1.A; 

public class B {
	public static void main(String[] args) {
		A a = new A();
	}
}
