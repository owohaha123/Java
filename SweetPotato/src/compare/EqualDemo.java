package compare;

public class EqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [Boolean]이란? : 참, 거짓을 표현하는 데이터형식
	
		
		// == (둘이 같음?)
		System.out.println(1 == 2); //false
		System.out.println(1 == 1); //true
		System.out.println("one" == "two"); //false
		System.out.println("one" == "one"); //true
		
		// != (둘이 같지 않음?)
		System.out.println(1 != 2); //true
		System.out.println(1 != 1); //false
		System.out.println("one" != "two"); //true
		System.out.println("one" != "one"); //false
		
		// >
		System.out.println(10 > 20); //false
		System.out.println(10 > 2); //true
		System.out.println(10 > 10); //false
		
		// >=
		System.out.println(10 >= 20); //false
		System.out.println(10 >= 2); //true
		System.out.println(10 >= 10); //true
		
		// .equals (일단 외우셈)
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b); //false
		System.out.println(a.equals(b)); //true
		
		
	}

}
