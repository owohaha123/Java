package loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		// i�� ���� 10���� �۴ٸ� true, ũ�ٸ� false.
		while (i < 10) {
			System.out.println("Coding Everybody" + i);
			i++;//= i+1(0~9) , [++i�� 1~10]
		}
		
		/* > i++�� �߰��� ����? 
		 * �켱���� �������� ���� ���� �ٲ�
		 * while (i < 10) {
		 *     i++ //= i+1(1~10) , [++i�� 0~9]
			   System.out.println("Coding Everybody" + i);
		   }
		 */
		
		
		/* > �� while ���� for������ �ۼ��ϸ� �Ʒ��� ����
		 * for (int i = 0; i < 10; i++) {
			   System.out.println("Cording Everybody" + i);
			}
			*/
				
		
		int max = 10; // ���� (���� ���ڸ� �ٲ��ָ�)
		// ���� �Һ� (�Ʒ� ������ �´� ���� ����. ���� ����?)
		int j = 0;
		while (j < max) {
			System.out.println("Everybody" + j);
			j++;
		}
		
	}

}
