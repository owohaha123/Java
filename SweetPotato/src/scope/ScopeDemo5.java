package scope;

public class ScopeDemo5 {

	public static void main(String[] args) {
		for (int i = 0;  i < 5; i++) {
			System.out.println(i);
		}
		//System.out.println(i); <- 오류(중괄호{}범위 내에서 i가 선언되지 않음)
	}

}
