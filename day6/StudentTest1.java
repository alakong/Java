package day6;

class Student{
	String name;
	int age;
	String project;
	void study(){
		System.out.println(name+"�� "+project+"�� �н��մϴ�.");
	}
	void studentinfo(){
		System.out.println(name+ " : "+age);
	}
}

public class StudentTest1 {
	public static void main(String[] args) {

		Student st1=new Student();//��ü�����ؼ� student class������ ��´�
		st1.name= "��ũ";
		st1.age=22;
		st1.project="�ڹ�";
		st1.studentinfo();
		st1.study();
		
		Student st2=new Student();
		st2.name= "�Ѹ�";
		st2.age=22;
		st2.project="����";
		st2.studentinfo();
		st2.study();
		
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println("st2=st1 ����");
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
	
	}

}
