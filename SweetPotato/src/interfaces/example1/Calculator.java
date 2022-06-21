package interfaces.example1;

// 또다른 작업자가 있다 해도 규격(Calculatable)이 있기에 문제 없음
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



