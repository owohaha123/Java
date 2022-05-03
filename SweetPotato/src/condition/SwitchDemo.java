package condition;

public class SwitchDemo {

	public static void main(String[] args) {

		//switch(n)�� ���, n '����' ����� ��� ���
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
			
		
		//���ϴ� case�� ���� ����ϰ� ���� ���, [break] �־��ֱ�
		//default�� ���ǵǾ� ���� ���, n�� �־��� case�� �ش����� �ʴ� ���, default ���� ���
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
