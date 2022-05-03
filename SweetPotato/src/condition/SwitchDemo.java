package condition;

public class SwitchDemo {

	public static void main(String[] args) {

		//switch(n)일 경우, n '이하' 결과값 모두 출력
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
			
		System.out.println("switch(2)");
		switch(2){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
			
		
		//원하는 case의 값만 출력하고 싶은 경우, [break] 넣어주기
		//default가 정의되어 있을 경우, n이 주어진 case에 해당하지 않는 경우, default 값이 출력
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		
		
		int val = 1;
		if(val == 1){
			System.out.println("one");
		} else if(val == 2){
			System.out.println("two");
		} else if(val == 3){
			System.out.println("three");	
		}
			
			

		
	}

}
