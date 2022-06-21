package interfaces.example2;

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}

// 인터페이스도 상속이 된다.
// 이 때, class B는 아래의 메소드를 갖게 됨
class B implements I4 {
	public void x() {}
	public void z() {}
}

// interface 의 멤버는 반드시 [public]이어야 함

// <abstract vs. interface>
// abstract class는 하위클래스에서 상속받아 사용하는 것을 강제하는 것 외엔 일반적 클래스와 같음
// interface는 본체가 없는 메소드만을 가질 수 있음 (구체적 로직x) 