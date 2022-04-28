package condition;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Login input egoing 재생 시 right 산출
		String id = args[0];
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {	
			System.out.println("wrong");
		}
		
	}

}
