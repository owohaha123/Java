package conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		// && = and
		if (true && true) {
			System.out.println(1);
		}//실행o
		
		if (true && false) {
			System.out.println(2);
		}//실행x (둘 중 하나라도 조건에 안 맞으면 ㄴ출력)
		
		if (false && true) {
			System.out.println(3);
		}//실행x
		
		if (false && false) {
			System.out.println(4);
		}//실행x

	}

}
