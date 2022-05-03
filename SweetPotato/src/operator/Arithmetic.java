package operator;

public class Arithmetic {

	public static void main(String[] args) {
		
		// result 의 값은 3
		int result = 1 + 2;
		System.out.println(result);
		
		// result 의 값은 2
		result = result - 1;
		System.out.println(result);

		// result 의 값은 4
		result = result * 2;
		System.out.println(result);
		
		// result 의 값은 2
		result = result / 2;
		System.out.println(result);
		
		// result 의 값은 10
		result = result + 8;
		System.out.println(result);
		
		// result 의 값은 3
		result = result % 7; //(10을 7로 나눈 나머지)
		System.out.println(result);
		
		//-------------------------------
		int a = 3;
		// %를 잘 쓰면 순환 수를 만들 수 있음 ㄱㅇㄷ
		System.out.println(0%a); //0
		System.out.println(1%a); //1
		System.out.println(2%a); //2
		System.out.println(3%a); //0
		System.out.println(4%a); //1
		System.out.println(5%a); //2
		System.out.println(6%a); //0


		
	}

}
