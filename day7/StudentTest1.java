package day7;

class Student{
	String name;
	int age;
	String project;
	Student(){
		System.out.println("Student Ŭ���� ��ü ����!!");
	}
	Student(String name, int age, String project){
		this.name=name;
		this.age=age;
		this.project=project;
	}
	Student(String project){//�Ű������� string�� �޴� ������/ �ƹ� string�ܾ  ������ ������ ��ġ�� ����
		name="��ġ";
		age=100;//this.age=100; this�� ��������
		this.project=project;
	}

	void study(){
		System.out.println(name+"�� "+project+"�� �н��մϴ�.");
	}
	void studentinfo(){
		System.out.println(name+ " : "+age);
	}
}

public class StudentTest1 {
	public static void main(String[] args) throws Exception{
		System.out.println("main() �޼��� �������");
		
		//Thread.sleep(5000);//���α׷� ������ ��� ������Ű�� ��
		System.out.println("Student Ŭ������ ��ü ����-1");
		Student st1=new Student();
		st1.name= "��ũ";
		st1.age=22;
		st1.project="�ڹ�";
		st1.studentinfo();
		st1.study();
		
		//Thread.sleep(5000);
		System.out.println("Student Ŭ������ ��ü ����-2");
		Student st2=new Student("�Ѹ�",22,"����");
		/*st2.name= "�Ѹ�";
		st2.age=22;
		st2.project="����";*/
		st2.studentinfo();
		st2.study();
		System.out.println("main() �޼��� ��������");

		
	}

}
