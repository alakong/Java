package day7;

class Student{
	String name;
	int age;
	String project;
	Student(){
		System.out.println("Student 클래스 객체 생성!!");
	}
	Student(String name, int age, String project){
		this.name=name;
		this.age=age;
		this.project=project;
	}
	Student(String project){//매개변수로 string을 받는 생성자/ 아무 string단어나  넣으면 무조건 또치가 나옴
		name="또치";
		age=100;//this.age=100; this는 생략가능
		this.project=project;
	}

	void study(){
		System.out.println(name+"가 "+project+"를 학습합니다.");
	}
	void studentinfo(){
		System.out.println(name+ " : "+age);
	}
}

public class StudentTest1 {
	public static void main(String[] args) throws Exception{
		System.out.println("main() 메서드 수행시작");
		
		//Thread.sleep(5000);//프로그램 수행을 잠시 지연시키는 것
		System.out.println("Student 클래스의 객체 생성-1");
		Student st1=new Student();
		st1.name= "듀크";
		st1.age=22;
		st1.project="자바";
		st1.studentinfo();
		st1.study();
		
		//Thread.sleep(5000);
		System.out.println("Student 클래스의 객체 생성-2");
		Student st2=new Student("둘리",22,"국어");
		/*st2.name= "둘리";
		st2.age=22;
		st2.project="국어";*/
		st2.studentinfo();
		st2.study();
		System.out.println("main() 메서드 수행종료");

		
	}

}
