package inheritance.example4;
//inheritance.example4 - culatorConstractDemo4 �� ����
//8~15�� �߰��Ǿ���


class Calculator2{
	int left, right;
	
	public Calculator2() {}
	
	// ������ ������ (32�� ���� �߻�)
	// ��ܿ� public Calculator(){}��� '�θ�Ŭ����' �߰��Ͽ� �⺻������ �����
	public Calculator2 (int left, int right) {
		this.left = left; 
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class SubstractionableCalculator2 extends Calculator2 {
	public SubstractionableCalculator2(int left, int right) {
		super(left, right); // <-super: �θ�Ŭ���� ��Ī (�̰ž��� 8�� ��� ��)
		// �⺻�����ڿ� �Ʒ��ڵ� �ߺ�, �Ʒ��ڵ� ��� super(left, right); �߰�
		 /* this.left = left; 
		    this.right = right; */
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CulculatorConstractDemo5 {
	public static void main(String[] args) {
		
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10, 20);
		
		c1.sum();
		c1.avg();
		c1.substract();

	}
}
