package condition;

public class LoginDemo {

	public static void main(String[] args) {
		
		//Login input egoing ��� �� right ����
		String id = args[0];
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {	
			System.out.println("wrong");
		}
		
	}

}
