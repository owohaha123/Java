package loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {  //10 되기 전까지 반복실행
				System.out.println(i + "" + j);// 00~99까지
				
			}
		}

	}

}
