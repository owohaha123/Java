package method;

public class ReturnDemo {

	public static int one() {
		return 1;
		/* return을 만나면 뒤는 실행 x
		return 2;
		return 3; << 실행x */
	}
	
	public static void main(String[] args) {
		System.out.println(one());
	}

}
