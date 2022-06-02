package method;

public class ReturnDemo4 {
	
	//ReturnDemo3 의 값을 한 번에 출력하고 싶을 땐 [배열] 사용
	public static String[] getMembers() {
		String[] members = {"최진혁" , "최유빈" , "한이람"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members);
		for(int i = 0; i< members.length; i++) {
			System.out.print(members[i]);
		}
	}

}
