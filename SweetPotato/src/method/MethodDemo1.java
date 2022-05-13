package method;

public class MethodDemo1 {
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}//정의
	
	public static void main(String[] args) {
		numbering();//호출
		numbering();
	}
}
	//main: 사용자-개발자 간 약속