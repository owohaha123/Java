package conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		//LoginDemo2 ����
		//���� if 2�� ���� �ʾƵ� &&(and)���� ��ġ�� ����
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing") && password.equals("111111")) {
		   System.out.println("right");
		} else {	
		   System.out.println("wrong");
		}	   

	}

}
