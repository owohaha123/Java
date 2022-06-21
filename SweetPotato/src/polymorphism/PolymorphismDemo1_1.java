package polymorphism;

class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";} //A의 x()를 overriding!
	public String y() {return "y";}
}

public class PolymorphismDemo1_1 {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x());
	  //obj.y(); <- 오류 (obj.x();는 가능)
	
	  /*why? A의 데이터타입을 한 B클래스의 인스턴스
	         형식과 틀은 부모(A)를 따르나, 자식(B)의 내용 실행. 
	         (overriding 기능 중 없는 메소드를 추가하는 기능은 제한하고 기존 메소드를 수정하는 기능만 남겨놓은 격)
	         B클래스에 A클래스에 속한 메소드와 동일한 메소드명이 있으면(overriding) B클래스의 메소드 실행 o */	
		
	  //★★ 쉽게 말하면 B(자식)를 A(부모)처럼 동작 시킬 수 있음
	  //   (B에 있고 A에 없는 메소드'y()'는 작동x / 작동된 메소드'x()'의 결과값은 B에 있는 걸로 산출)
	}
}

