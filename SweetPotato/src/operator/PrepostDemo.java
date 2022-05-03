package operator;

public class PrepostDemo {

	public static void main(String[] args) {
		
		int i = 3;
		++i; //전위연산자 ()안에서 연산 끗
		System.out.println(i); //4출력
		System.out.println(++i); //5출력
		System.out.println(++i); //6출력

		System.out.println(i++); //6출력
		System.out.println(i++); //7출력
		System.out.println(i); //8출력

		i++; // 후위연산자 ()이후 다음줄에 결과값 나옴
		System.out.println(i); //9출력
		System.out.println(i++); //9출력
		System.out.println(i++); //10출력
		System.out.println(i); //11출력

		System.out.println(++i); //12출력
		System.out.println(++i); //13출력
	}

}
