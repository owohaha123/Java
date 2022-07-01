package constant2;
/* enum�� ����Ͽ� ����ȭ �Ѵ�
class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}	
class Company{
	public static final Company google = new Company();
	public static final Company APPLE = new Company();
	public static final Company OLACLE = new Company();
}*/

/* ����?
 * �ڵ尡 �ܼ��� ��
 * �̸� ����Ͽ� �ν��Ͻ��� ������ ����� ����.
 * enum�� ����ϱ� ������ �����ǵ��� ���Ÿ� ���� ������ �и��� �� �� ���� (Ŭ������ ����� �����ϰ� �Ǹ� ���� �Ҵ�)
 * 
 */

//enum�� ��� Ŭ����. ���� ������(�ʵ�,�޼ҵ�)�� ���� �� �ִ�.

enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color) {
		this.color = color;
	}
}
enum Company{
	google, APPLE, OLACLE
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) { 
		case APPLE:
			System.out.println(57+" kcal, color "+Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34+" kcal, color "+Fruit.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93+" kcal, color "+Fruit.BANANA.getColor());
			break;
		}
	}
}
