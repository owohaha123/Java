package method;

import java.io.*;

public class MethodDemo7 {

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;// = [output + i;]와 같은 의미
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		// 아래 예시는 파일로 출력하려 할 때 사용
		try {
			// 다음 행은 out.txt라는 파일에 numbering이라는 메소드가 반환한 값을 저장
		    BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		    out.write(result);
		    out.close();
		} catch (IOException e) {
		}
	}
}