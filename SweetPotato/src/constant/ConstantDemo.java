package constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// int a = 2.2; (X: 정수형 데이터 타입)
		// float a = 2.2; (X: 실수형이나 형이 맞지 않음)
		double a = 2.2; // (O: [데이터타입]이 일치)
						// 실수의 기본적 [데이터타입]은 'double'
		float b = 2.2F; // (O: 변수를 'float'타입으로 명시)
		
		
		// int C = 2147483648; (X: 'int'는 ~2147483647 까지만 표현가능)
		// long C = 2147483648; (x: 변수가 아직 'int' 타입)
		long c = 2147483648L; // (O: 변수를 'long'타입으로 명시)
		
		byte d = 100; // (O: 'byte' 타입 사용 시 해당 타입이 표현가능한 범위 내에서는 int형 변수 사용가능)
					  // int형 변수? 기본변수 (정수형 변수 뒤 아무것도 붙지 않는 것)
		short e = 200; // (O: 상동)
	}

		// 형변환
		/* int형(200)과 float형(200.0)의 bit 값은 숫자가 같아도 서로 다름
		 * int 200(정수) : 00000000 00000000 00000000 11001000
		 * float 200.0(실수) : 01000011 01001000 00000000 00000000
		 * 이처럼 데이터와 변수의 형식을 알맞게 맞춰주는 것이 '형변환'*/

		//자동형변환
		/* double a = 3.0F; (O: 데이터타입과 변수형태가 서로 맞지 않으나 자바가 자동으로 알맞게 변환해 줌)
		 * Why? float 보다 double 이 더 많은 데이터를 표현할 수 있기 때문*/

		/* float = 3.0; (X: 자동형변환 불가능)
		 * Why? float 이 double 형 변수를 다 담아내지 못하기에 데이터손실이 발생할 수 있기 때문*/

		/* 자동형변환 원칙: 범위가 좁은 데이터타입에서 넓은 데이터타입으로의 변환만 허용
		 * byte < short < int < long < float < double 
		 * 		   char < int < long < float < double*/	

		int f = 3; // 정수형
		float g = 1.0F; // 실수형
		double h = f+g; // = 4.0F
						// why? double은 float 을 포함할 수 있기에 가능
						// f가 g로 자동형변환되어 연산 (3.0F + 1.0F = 4.0F)
		
}