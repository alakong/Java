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
		if (obj instanceof Person) {//�ϴ� ���޵� ��ü�� Person������ Ȯ��
			Person tmp = (Person) obj;
			return name.equals(tmp.name) && age == tmp.age;//�Ѵ� �����ϸ� true
		}
		return false;
	}

	public int hashCode() {//���� ��ü�� �ؽ��ڵ尪�� ����/��ü�� ���� ������ ���ڷ� ǥ���� ���� �ؽ��ڵ� 
		return name.hashCode() + age;
	}
	
	public int compareTo(Person p){
		int result=0;//�����Ҷ�
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
		// HashSet�� ��׸� �ٸ� ��ü�� ��->Ŭ������ � ������ ������ ��ü���θ� ���������� ���������ֱ� ����
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
		
		Arrays.sort(ary1);//�迭 ���Ұ����� sort
		
		for(int d :ary1)
			System.out.println(d);*/
		
		/*Person p1=new Person("��ũ",22);
		Person p2=new Person("��ũ",22);
		System.out.println(p1.hashCode());//�������̵��Ѱ� ���ƹ����� ��ü�� �������� �����Ƿ� �Ʒ��� ��ũ�� �ؽ��ڵ尪 ����� �ٸ���
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));//�������̵� �ϱ� �� ���� �������� �������� ������� ������ ��
		Person p3=new Person("�ν�",30);
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3));*/
	}

}
