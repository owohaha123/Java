package interfaces.example2;

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}

// �������̽��� ����� �ȴ�.
// �� ��, class B�� �Ʒ��� �޼ҵ带 ���� ��
class B implements I4 {
	public void x() {}
	public void z() {}
}

// interface �� ����� �ݵ�� [public]�̾�� ��

// <abstract vs. interface>
// abstract class�� ����Ŭ�������� ��ӹ޾� ����ϴ� ���� �����ϴ� �� �ܿ� �Ϲ��� Ŭ������ ����
// interface�� ��ü�� ���� �޼ҵ常�� ���� �� ���� (��ü�� ����x) 