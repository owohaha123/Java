package abstractclass.example1;
// 추상클래스 A
/* 추상클래스를 먼저 정의했다기 보단,
   메소드 b()가 추상메소드이기 때문에 이를 가진 클래스는 자동으로 추상클래스가 됨 */
// 멤버 중 하나라도 abstract라면 그를 담은 class도 abstract가 됨
abstract class A {
	
	// 추상메소드 b()
	public abstract int b();
	// {}없음 = 구체적 로직x
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없음
    // public abstract int c(); {System.out.println("Hello")};
	
    // 추상 클래스 내엔 추상 메소드가 아닌 메소드가 존재할 수 있다
	public void d(){
		System.out.println("world");
	}
}
class B extends A {
	public int b() {
		return 1;
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}
}
