package method;

public class ReturnDemo2 {
	
	public static String num(int i) {  //i는 1일 때
		if(i==0) {
			return "zero"; // i는 0이 아니므로 false 상태
			// return을 만나면 끊겨야 하지만 false 상태이므로 해당 return 실행 x
		} else if (i==1) { 
			return "one"; // 조건에 맞는 이 값이 산출
		} else if (i==2) {
			return "two";	
		}
		return "none";
	}

	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
