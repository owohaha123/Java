package scope;

class C {
	int v = 10;
	
	void m() {
		// int v = 20; (<-�� ���, 20�� ���� -���������� �켱)
		// ���� ���� ���� ��ø ���� ������ �ش� �޼ҵ�(m())���� ������ �����ִ°� ����
		System.out.println(v);
		// �ٵ� �ش� �޼ҵ� �ȿ��� ��������(10)�� ���� ����ʹٸ�?
		// System.out.println(this.v); �Է��ϸ� �� (����= 20,10)
		// this�� �ν��Ͻ� �ڽ��� �ǹ�(���⼱ ������ �ǹ̸� ����)
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}

	// �������� ���α׷��ֿ����� ���������� ����� �ݱ�� �� (�����߻���)
	// ��ü���� ���α׷��ֿ��� �޼ҵ带 ���� ��ȿ������ ������ �� �ֱ⿡ ���� ����! (�׷��� ������ ����)