package polymorphism;

//overloading�� ������ ���鿡�� �ٶ� �� ���� (���� �̸�, �ٸ� ���۹��)
class O{
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("�������");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
	}
}
