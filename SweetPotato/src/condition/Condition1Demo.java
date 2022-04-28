package condition;

public class Condition1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  if(true) {
			  System.out.println("result : true");
		  }
		  // false로 바꾸면 then절 출력 안 됨
		  if(true) {
			  System.out.println(1);
			  System.out.println(2);
			  System.out.println(3);
			  System.out.println(4);
		  }
		  System.out.println(5);
		  		  
	   //-------------------------------
		  //if_else : true일 경우 else 앞 실행, false일 경우 else 뒤가 실행
		  if(true) {
			  System.out.println(1); //실행o
		  } else {
			  System.out.println(2); //실행x
		  }
		  
		  if(false) {
			  System.out.println(1); //실행x
		  } else {
			  System.out.println(2); //실행o
		  }
	   //-------------------------------  
		  //if_else if_else : else if에서 가장 먼저 나오는 것만 실행되고 나머진 x
		  if(false) {
			  System.out.println(1); //실행x
		  } else if(true){
			  System.out.println(2); //실행o
		  } else if(true){
			  System.out.println(3); //실행x
		  } else {
			  System.out.println(4); //실행x
		  }
	}

}
