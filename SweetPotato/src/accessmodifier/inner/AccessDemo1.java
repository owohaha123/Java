package accessmodifier.inner;
//���������ڿ� ���Ͽ�

class A {
	// public : ������ ��밡���� �޼ҵ�
	public String y() {
		return "public void z()";
	}
	// private : Ŭ���� ����(A)���� ��밡��. �ܺ�(AccessDemo1)���� ���x
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}

public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		
		// private �޼ҵ��� �ܺ� ��� �Ұ�
		// System.out.println(a.z());
		
		// x()�� A�� �����ֱ⿡ private �޼ҵ�(z()) ȣ��o
		// private =  ����������
		System.out.println(a.x());
	}
}
		// ���������ڸ� ����ϴ� ����?
		/* [������ â��: public / �ݰ�:private] �̶� �����ϸ� ����!
		    �̴� [����]�̶� �ý����� ��ȣ�ϱ� ���� */
		/* �� ���������� ������ �Ʒ��� ����
		   ��: AccessDemo1 / â��: classA�� y(), x() / �ݰ�: private */
