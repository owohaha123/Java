package polymorphism;

interface I2 {
	public String A();
}
interface I3 {
	public String B();
}
class F implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		F obj = new F();
		I2 objI2 = new F();
		I3 objI3 = new F();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//objI3.A();
		objI3.B();
	}
}
