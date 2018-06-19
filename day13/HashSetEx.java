package day13;

import java.util.*;

class Person implements Comparable<Person>{
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {//일단 전달된 객체가 Person형인지 확인
			Person tmp = (Person) obj;
			return name.equals(tmp.name) && age == tmp.age;//둘다 동일하면 true
		}
		return false;
	}

	public int hashCode() {//같은 객체는 해쉬코드값이 같음/객체에 대한 정보를 숫자로 표현한 것이 해쉬코드 
		return name.hashCode() + age;
	}
	
	public int compareTo(Person p){
		int result=0;//동일할때
		if(age>p.age)
			result=1;
		else if(age<p.age)
			result=-1;
		return result;
	}

}

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		// HashSet은 얘네를 다른 객체로 봄->클래스의 어떤 변수로 동일한 객체여부를 구분지을지 안정해져있기 때문
		set.add(new Person("Tom", 10));
		set.add(new Person("David", 20));
		set.add(new Person("Jarry", 30));
		System.out.println(set);
		Object ary[]=set.toArray();
		for(Object d : ary)
			System.out.println(d);
		
		Arrays.sort(ary);
		
		for(Object d :ary)
			System.out.println(d);
		
		
		
		
		/*int[] ary1={10,2,7,15,9,20,3};
		
		for(int d : ary1)
			System.out.println(d);
		
		Arrays.sort(ary1);//배열 원소값들을 sort
		
		for(int d :ary1)
			System.out.println(d);*/
		
		/*Person p1=new Person("듀크",22);
		Person p2=new Person("듀크",22);
		System.out.println(p1.hashCode());//오버라이딩한거 막아버리면 객체의 참조값이 나오므로 아래위 듀크는 해쉬코드값 결과가 다르다
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));//오버라이딩 하기 전 원래 이퀄스는 참조값이 같은경우 이퀄로 봄
		Person p3=new Person("턱시",30);
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3));*/
	}

}
