package overriding.example1;

public class OverloadingDemo2 extends OverloadingDemo{
	// �����ε� (�߰� / ���� �̸�, �ٸ� �Ű�����)
	void A (String arg1,String arg2) {System.out.println("sub class : void A(String arg1,String arg2)");}
	// �������̵� (������ / ���� �̸�, ���� �Ű�����)
	void A () {System.out.println("sub class : void A()");} //�������̵� (������)
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A(); //�������̵� ����
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody" , "coding everybody");//�����ε� ����
	}
}
