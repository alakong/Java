package day8;
//+�� public ������ ��밡�� -��ȣ�� private������ ���������� ��밡��(�ڽĵ��ȵ�)
class Person{
	private String name;
	Person(String name){
		this.name = name;
	}
	public String getInfo(){
		return name;
	}	
}

class Friend extends Person{
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum=phoneNum;
		this.email=email;		
	}
	
	public String getInfo(){
		return super.getInfo()+"   "+phoneNum+"   "+email;
	}
}

public class FriendTest {
	public static void main(String[] args) {
		
		Friend[] fList =new Friend[5];
		fList[0]=new Friend("qwe","99090954","bbamabamabi@");
		fList[1]=new Friend("ads","12345633","sfdfsg@");
		fList[2]=new Friend("bas","15643981","fgergaeger@");
		fList[3]=new Friend("cqe","63636357","fgfga@");
		fList[4]=new Friend("djy","15414631","gnnh@");
		
		System.out.println("�̸�"+"      "+"��ȭ��ȣ"+"        "+"�����ּ�"+"      ");
		System.out.println("---------------------------------------");
		for(Friend f : fList){
			System.out.println(f.getInfo());
			
		}
		

	}

}
