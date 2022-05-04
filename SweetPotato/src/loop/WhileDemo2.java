package loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false.
		while (i < 10) {
			System.out.println("Coding Everybody" + i);
			i++;//= i+1(0~9) , [++i면 1~10]
		}
		
		/* > i++을 중간에 쓰면? 
		 * 우선순위 변경으로 인해 값이 바뀜
		 * while (i < 10) {
		 *     i++ //= i+1(1~10) , [++i면 0~9]
			   System.out.println("Coding Everybody" + i);
		   }
		 */
		
		
		/* > 위 while 문을 for문으로 작성하면 아래와 같음
		 * for (int i = 0; i < 10; i++) {
			   System.out.println("Cording Everybody" + i);
			}
			*/
				
		
		int max = 10; // 가변 (여기 숫자를 바꿔주면)
		// 이하 불변 (아래 로직에 맞는 숫자 산출. 계산기 느낌?)
		int j = 0;
		while (j < max) {
			System.out.println("Everybody" + j);
			j++;
		}
		
	}

}
