package method;

import java.io.*;

public class MethodDemo7 {

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;// = [output + i;]�� ���� �ǹ�
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		// �Ʒ� ���ô� ���Ϸ� ����Ϸ� �� �� ���
		try {
			// ���� ���� out.txt��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� ����
		    BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		    out.write(result);
		    out.close();
		} catch (IOException e) {
		}
	}
}