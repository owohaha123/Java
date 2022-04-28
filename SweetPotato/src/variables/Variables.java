package variables;

public class Variables {

	public static void main(String[] args) {
		int a; //정수 int(-20억~20억)
		//그 외 정수함수: byte(-128~127), short(-32,768~32,767), long(-1000조~1000조)
		// 메모리 사용량에 따라 나뉨 ㅇㅇ
		a = 1;
		System.out.println(a+1); //2
		a = 2;
		System.out.println(a+1); //3
		
		
		double b; //실수
		// 그 외 실수함수: float (<-굳이 사용할 일 없음)
		b = 1.1;
		System.out.println(b+1.1); //2.2
		double c;
		c = 3;
		System.out.println(c+1.1); //4.1 되긴 됨^^
		
	}

}
