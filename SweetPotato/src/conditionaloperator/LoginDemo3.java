package conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		//LoginDemo2 참고
		//굳이 if 2개 쓰지 않아도 &&(and)으로 퉁치기 가능
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing") && password.equals("111111")) {
		   System.out.println("right");
		} else {	
		   System.out.println("wrong");
		}	   

	}

}
