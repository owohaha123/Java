package abstractclass.example1;
// �߻�Ŭ���� A
/* �߻�Ŭ������ ���� �����ߴٱ� ����,
   �޼ҵ� b()�� �߻�޼ҵ��̱� ������ �̸� ���� Ŭ������ �ڵ����� �߻�Ŭ������ �� */
// ��� �� �ϳ��� abstract��� �׸� ���� class�� abstract�� ��
abstract class A {
	
	// �߻�޼ҵ� b()
	public abstract int b();
	// {}���� = ��ü�� ����x
	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����
    // public abstract int c(); {System.out.println("Hello")};
	
    // �߻� Ŭ���� ���� �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�
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
