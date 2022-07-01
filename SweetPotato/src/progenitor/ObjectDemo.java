package progenitor;
//���� : ��� Ŭ������ ������ Object. ���� �̸� overriding ����

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj) { // �ڽ�Ŭ����(Student)���� �θ�Ŭ����(Object) ������, �ڵ�����ȯ (������: Polymorphism)
		Student s = (Student)obj; // �θ�Ŭ����(Object)�� ���� ������Ÿ��(obj)�� �ڽ��� ������Ÿ������ ���������ȯ (�ڵ�����ȯ �Ұ�)
								  // ���õ�������(byte,short,int,long,float,double,boolean,char)�� new ������ �Ƚᵵ ��!
		return this.name == s.name;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); // false (��ü�� �ּ� �ٸ�)
		System.out.println(s1.equals(s2)); // true
	}

}
