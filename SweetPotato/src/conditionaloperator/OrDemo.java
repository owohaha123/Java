package conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		// ||=or (둘 중 하나라도 참이면 ㅇㅇ)
		if (true || true) {
			System.out.println(1);
		}//실행o
		
		if (true || false) {
			System.out.println(2);
		}//실행o
		
		if (false || true) {
			System.out.println(3);
		}//실행o
		
		if (false || false) {
			System.out.println(4);
		}//실행x

	}

}
