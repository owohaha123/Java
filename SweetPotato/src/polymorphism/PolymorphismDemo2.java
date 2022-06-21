package polymorphism;

interface I {}
class E1 implements I{}

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		I obj = new E1();
	}
}
