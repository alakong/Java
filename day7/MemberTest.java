package day7;

class Member {//Ŭ�����̸� ù���ڴ� �빮��!!
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
		m1.name="��浿";
		m1.account="guest";
		m1.passwd="@12345";
		m1.birthyear=2010;
		System.out.println(m1.getMemberinfo());
		m1=null;//null->������ ���ͷ�/�� ��� infoȣ�� �Ұ�/��ü ������ ���ػ����̹Ƿ�
		//System.out.println(m1.getMemberinfo());-> �����߻� : null point exception

	}

}
