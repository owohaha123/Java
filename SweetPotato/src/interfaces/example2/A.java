package interfaces.example2;

interface I1{
	public void x();
}

interface I2{
	public void z();
}

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� ���� (��Ӱ��� ���̰� ����)
// Ŭ���� A�� �޼ҵ� �� �ϳ��� �������� ������ ���� �߻�
class A implements I1, I2{
	public void x() {}
	public void z() {}
}
