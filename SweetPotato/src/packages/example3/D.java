package packages.example3;
// B 클래스 중복 상태
import packages.example1.*;
import packages.example2.*;

// 클래스 중복 시 어느 것을 사용할 지 명시해주면 됨
public class D {
	public static void main(String[] args) {
		packages.example1.B b = new packages.example1.B();
	}
}
