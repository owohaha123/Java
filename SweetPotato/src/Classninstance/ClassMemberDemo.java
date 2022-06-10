package Classninstance;
//78��(Ŭ�������,�ν��Ͻ����(4/4)��� �����ϸ� ���� ���� ��

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		// Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ������ �� ����
		// System.out.println(instance_variable);
	}
	void instance_static() {
		// �ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ������ �� �ִ�
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		// �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
		// �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
		
		//c��� �ν��Ͻ� ���� (�ν��Ͻ�.~�޼ҵ�.~����)
		c.static_static(); // 1 ���
		// 4,6~7��°�� ����
		// �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
		// ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		c.static_instance(); // ���x
		// 9��°�� ����
		// �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		// �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� -> ����
		c.instance_static(); // 1 ���
		// 4,13~15��°�� ����
		// �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		// �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		c.instance_instance(); //  2 ���
		// 5,17~18��°�� ����
		// Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
		// Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����
		
		//C1�̶� Ŭ���� ���� (Ŭ����.~�޼ҵ�.~����)
		C1.static_static(); // 1 ���
		// 4,6~7��°�� ����
		// Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
		// Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		C1.static_instance();  // ���x
		// 9��°�� ����
		// Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		//C1.instance_static(); // ���x(�ƿ� ����)
		// Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		//C1.instance_instance(); // ���x(�ƿ� ����)
	}
}


