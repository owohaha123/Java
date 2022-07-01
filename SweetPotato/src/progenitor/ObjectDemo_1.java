package progenitor;


class Student_1 implements Cloneable{ // Student_1 은 복제가능한(Cloneable) 클래스임을 명시
	String name;
	Student_1(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectDemo_1 {
	public static void main(String[] args) {
		Student_1 s1 = new Student_1("egoing");
		try {
			Student s2 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
