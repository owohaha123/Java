package method;

public class MethodDemo4 {

		public static void numbering(int limit) { //(��ȣ �� �����̸�: �Ű�����)
			int i = 0;
			while (i<limit) {
				System.out.println(i);
				i++;
			}
		}
		/*= �Ʒ� ���İ� ���� ����
		 * public static void numbering() {
			int limit = 5;
			int = 0;
			while (i<limit) {
				System.out.println(i);
				i++;
			}
		}*/
		
		public static void main(String[] args) {
			numbering(5);// (��ȣ �� ����n�̸�: ����)
	}

}
