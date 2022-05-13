package method;

public class MethodDemo2 {
	// method가 없다면? 동일코드를 반복해서 써야 함(비효율)
	public static void main(String[] args) {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}

		i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		//...
	}

}
