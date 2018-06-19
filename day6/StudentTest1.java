package day6;

class Student{
	String name;
	int age;
	String project;
	void study(){
		System.out.println(name+"가 "+project+"를 학습합니다.");
	}
	void studentinfo(){
		System.out.println(name+ " : "+age);
	}
}

public class StudentTest1 {
	public static void main(String[] args) {

		Student st1=new Student();//객체생성해서 student class변수에 담는다
		st1.name= "듀크";
		st1.age=22;
		st1.project="자바";
		st1.studentinfo();
		st1.study();
		
		Student st2=new Student();
		st2.name= "둘리";
		st2.age=22;
		st2.project="국어";
		st2.studentinfo();
		st2.study();
		
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println("st2=st1 수행");
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
	
	}

}
