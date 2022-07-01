package constant2;
/* enum을 사용하여 간소화 한다
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

/* 이점?
 * 코드가 단순해 짐
 * 이를 사용하여 인스턴스의 생성과 상속을 방지.
 * enum을 사용하기 때문에 구현의도가 열거를 위한 것임을 분명히 할 수 있음 (클래스를 상수로 정의하게 되면 열거 불능)
 * 
 */

//enum은 사실 클래스. 따라서 생성자(필드,메소드)를 가질 수 있다.

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
