package method;

public class ReturnDemo4 {
	
	//ReturnDemo3 �� ���� �� ���� ����ϰ� ���� �� [�迭] ���
	public static String[] getMembers() {
		String[] members = {"������" , "������" , "���̶�"};
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
