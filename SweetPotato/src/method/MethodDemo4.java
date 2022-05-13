package method;

public class MethodDemo4 {

		public static void numbering(int limit) { //(괄호 안 변수이름: 매개변수)
			int i = 0;
			while (i<limit) {
				System.out.println(i);
				i++;
			}
		}
		/*= 아래 수식과 같은 내용
		 * public static void numbering() {
			int limit = 5;
			int = 0;
			while (i<limit) {
				System.out.println(i);
				i++;
			}
		}*/
		
		public static void main(String[] args) {
			numbering(5);// (괄호 안 숫자n이름: 인자)
	}

}
