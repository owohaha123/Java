package Classninstance;
//Ŭ���� ����

class Calculator2{
	static double PI = 3.14;
	//Ŭ���� ������ base �߰�
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right;
	}

	public void sum() {
		// ������ base���� ���Խ�Ų��
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		// ��հ��� base���� ���Խ�Ų��
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalcuiatorDemo2 {

	public static void main(String[] args) {
				
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		//30���
		c1.sum();

		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		//60���
		c2.sum();
		
		// Ŭ���� ���� base�� ���� 10���� ����
		Calculator2.base = 10;
		
		//40���
		c1.sum();
		
		//70���
		c2.sum();
	}
}
