package interfaces.example1;

// �Ǵٸ� �۾��ڰ� �ִ� �ص� �԰�(Calculatable)�� �ֱ⿡ ���� ����
class Calculator implements Calculatable{
	int first, second, third ;
	public void setOperands (int first, int second, int third){
		this.first = first ;
		this.second = second ;
		this.third = third ;
	}
	public int sum() {
		return this.first + this.second + this.third ;
	}
	public int avg() {
		return (this.first + this.second + this.third) / 2 ;
	}
}



