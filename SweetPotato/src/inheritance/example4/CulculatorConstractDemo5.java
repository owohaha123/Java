package inheritance.example4;
//inheritance.example4 - culatorConstractDemo4 의 변형
//8~15줄 추가되었음


class Calculator2{
	int left, right;
	
	public Calculator2() {}
	
	// 생성자 미정의 (32줄 오류 발생)
	// 상단에 public Calculator(){}라는 '부모클래스' 추가하여 기본생성자 만들기
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
		super(left, right); // <-super: 부모클래스 지칭 (이거쓰면 8줄 없어도 됨)
		// 기본생성자와 아래코드 중복, 아래코드 대신 super(left, right); 추가
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
