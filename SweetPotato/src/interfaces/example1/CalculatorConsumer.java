package interfaces.example1;

// ��¥Ŭ���� CalculatorDummy �����Ͽ� �ӽ� ���
// Calculatable�̶�� �������̽��� implements(����)�Ͽ� ������ ��Ȳ�̳� ������ ���� (�԰�����)
class CalculatorDummy implements Calculatable{
	public void setOperands (int first, int second, int third){}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}
public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy(); // ������ �Ϸ�Ǿ��ٸ� �� �ٿ��� Dummy�� ����� �����ϸ� ����
		c.setOperands(10,20,30);
		System.out.println(c.sum()+c.avg());
	}
}
