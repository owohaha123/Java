package operator;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); //소수점 뒤의 값 ㅃㅇ
		System.out.println(c/d); //소수점 뒤 생존
		System.out.println(a/d); //실수에 맞게 a가 자동형변환 됨


	}

}
