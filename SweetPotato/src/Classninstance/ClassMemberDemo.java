package Classninstance;
//78강(클래스멤버,인스턴스멤버(4/4)댓글 참고하면 이해 쉬움 ㅠ

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다
		// System.out.println(instance_variable);
	}
	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근할 수 있다
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		
		//c라는 인스턴스 기준 (인스턴스.~메소드.~변수)
		c.static_static(); // 1 출력
		// 4,6~7번째줄 참고
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 정적 메소드가 인스턴스 변수에 접근 -> 실패
		c.static_instance(); // 출력x
		// 9번째줄 참고
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instance_static(); // 1 출력
		// 4,13~15번째줄 참고
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		c.instance_instance(); //  2 출력
		// 5,17~18번째줄 참고
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 클래스 변수에 접근 -> 성공
		
		//C1이란 클래스 기준 (클래스.~메소드.~변수)
		C1.static_static(); // 1 출력
		// 4,6~7번째줄 참고
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.static_instance();  // 출력x
		// 9번째줄 참고
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		//C1.instance_static(); // 출력x(아예 에러)
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		//C1.instance_instance(); // 출력x(아예 에러)
	}
}


