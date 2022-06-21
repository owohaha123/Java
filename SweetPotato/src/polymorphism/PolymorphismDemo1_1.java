package polymorphism;

class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";} //A�� x()�� overriding!
	public String y() {return "y";}
}

public class PolymorphismDemo1_1 {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x());
	  //obj.y(); <- ���� (obj.x();�� ����)
	
	  /*why? A�� ������Ÿ���� �� BŬ������ �ν��Ͻ�
	         ���İ� Ʋ�� �θ�(A)�� ������, �ڽ�(B)�� ���� ����. 
	         (overriding ��� �� ���� �޼ҵ带 �߰��ϴ� ����� �����ϰ� ���� �޼ҵ带 �����ϴ� ��ɸ� ���ܳ��� ��)
	         BŬ������ AŬ������ ���� �޼ҵ�� ������ �޼ҵ���� ������(overriding) BŬ������ �޼ҵ� ���� o */	
		
	  //�ڡ� ���� ���ϸ� B(�ڽ�)�� A(�θ�)ó�� ���� ��ų �� ����
	  //   (B�� �ְ� A�� ���� �޼ҵ�'y()'�� �۵�x / �۵��� �޼ҵ�'x()'�� ������� B�� �ִ� �ɷ� ����)
	}
}

