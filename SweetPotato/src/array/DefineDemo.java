package array;

public class DefineDemo {

	public static void main(String[] args) {
		//배열
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" }; //"원소-element"
		System.out.println(classGroup[0]);//[index-색인]
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);

		// 다른 방법으로도 표현 가능하다.
		String[] classBand = new String[4];
		classBand[0] = "최진혁";
		System.out.println(classBand.length);//데이터 최대 크기 (따라서 4만 출력됨)
		classBand[1] = "최유빈";
		System.out.println(classBand.length);//상동
		classBand[2] = "한이람";
		System.out.println(classBand.length);
		classBand[3] = "이고잉";
		System.out.println(classBand.length);
	}

}
