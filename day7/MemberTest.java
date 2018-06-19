package day7;

class Member {//클래스이름 첫글자는 대문자!!
	String name;
	String account;
	String passwd;
	int birthyear;
	String getMemberinfo(){
		return name +":"+account+":"+birthyear+":"+passwd;
	}
}

public class MemberTest {

	public static void main(String[] args) {
		Member m1 =new Member();
		System.out.println(m1);
		System.out.println(m1.getMemberinfo());
		m1.name="고길동";
		m1.account="guest";
		m1.passwd="@12345";
		m1.birthyear=2010;
		System.out.println(m1.getMemberinfo());
		m1=null;//null->참조형 리터럴/이 경우 info호출 불가/객체 참조를 없앤상태이므로
		//System.out.println(m1.getMemberinfo());-> 오류발생 : null point exception

	}

}
