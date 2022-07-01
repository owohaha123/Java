package progenitor;
//전제 : 모든 클래스의 조상은 Object. 따라서 이를 overriding 가능

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj) { // 자식클래스(Student)에서 부모클래스(Object) 재정의, 자동형변환 (다형성: Polymorphism)
		Student s = (Student)obj; // 부모클래스(Object)에 속한 데이터타입(obj)을 자식의 데이터타입으로 명시적형변환 (자동형변환 불가)
								  // 원시데이터형(byte,short,int,long,float,double,boolean,char)은 new 연산자 안써도 됨!
		return this.name == s.name;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); // false (객체별 주소 다름)
		System.out.println(s1.equals(s2)); // true
	}

}
