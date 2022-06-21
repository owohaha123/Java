package interfaces.example2;

interface I1{
	public void x();
}

interface I2{
	public void z();
}

// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있음 (상속과는 차이가 있음)
// 클래스 A는 메소드 중 하나라도 구현하지 않으면 오류 발생
class A implements I1, I2{
	public void x() {}
	public void z() {}
}
