package array;

public class DefineDemo {

	public static void main(String[] args) {
		//�迭
		String[] classGroup = { "������", "������", "���̶�", "�̰���" }; //"����-element"
		System.out.println(classGroup[0]);//[index-����]
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);

		// �ٸ� ������ε� ǥ�� �����ϴ�.
		String[] classBand = new String[4];
		classBand[0] = "������";
		System.out.println(classBand.length);//������ �ִ� ũ�� (���� 4�� ��µ�)
		classBand[1] = "������";
		System.out.println(classBand.length);//��
		classBand[2] = "���̶�";
		System.out.println(classBand.length);
		classBand[3] = "�̰���";
		System.out.println(classBand.length);
	}

}
