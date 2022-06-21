package polymorphism;
//PolymorphismDemo1ÀÇ º¯Çü

class C{
	public String x() {return "C.x";}
}
class D extends C{
	public String x() {return "D.x";} 
	public String y() {return "y";}
}
class D2 extends C{
	public String x() {return "D2.x";}
}

public class PolymorphismDemo1_2 {
	public static void main(String[] args) {
		C obj = new D();
		C obj2 = new D2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}