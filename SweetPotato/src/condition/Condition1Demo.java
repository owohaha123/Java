package condition;

public class Condition1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  if(true) {
			  System.out.println("result : true");
		  }
		  // false�� �ٲٸ� then�� ��� �� ��
		  if(true) {
			  System.out.println(1);
			  System.out.println(2);
			  System.out.println(3);
			  System.out.println(4);
		  }
		  System.out.println(5);
		  		  
	   //-------------------------------
		  //if_else : true�� ��� else �� ����, false�� ��� else �ڰ� ����
		  if(true) {
			  System.out.println(1); //����o
		  } else {
			  System.out.println(2); //����x
		  }
		  
		  if(false) {
			  System.out.println(1); //����x
		  } else {
			  System.out.println(2); //����o
		  }
	   //-------------------------------  
		  //if_else if_else : else if���� ���� ���� ������ �͸� ����ǰ� ������ x
		  if(false) {
			  System.out.println(1); //����x
		  } else if(true){
			  System.out.println(2); //����o
		  } else if(true){
			  System.out.println(3); //����x
		  } else {
			  System.out.println(4); //����x
		  }
	}

}
