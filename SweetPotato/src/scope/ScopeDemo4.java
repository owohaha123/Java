package scope;

public class ScopeDemo4 {
	static void a() {
		String title = "cording everyday";
	}

	public static void main(String[] args) {
		a();
		//System.out.println(title); <- ����(title�� ������� ����)
	}
}
