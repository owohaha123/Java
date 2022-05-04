package loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;// 5 미출력 (1~4 , 6~9만 출력) 
						 // 지정값의 점프가 일어남 (중간 날먹)
		System.out.println("Coding Everybody" + i);
		}

	}

}
