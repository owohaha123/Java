package overriding.example1;

public class OverloadingDemo2 extends OverloadingDemo{
	// 오버로딩 (추가 / 같은 이름, 다른 매개변수)
	void A (String arg1,String arg2) {System.out.println("sub class : void A(String arg1,String arg2)");}
	// 오버라이딩 (재정의 / 같은 이름, 같은 매개변수)
	void A () {System.out.println("sub class : void A()");} //오버라이딩 (재정의)
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A(); //오버라이딩 따름
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody" , "coding everybody");//오버로딩 따름
	}
}
