package day8;
//+는 public 누구나 사용가능 -기호는 private한정된 범위에서만 사용가능(자식도안돼)
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
		
		System.out.println("이름"+"      "+"전화번호"+"        "+"메일주소"+"      ");
		System.out.println("---------------------------------------");
		for(Friend f : fList){
			System.out.println(f.getInfo());
			
		}
		

	}

}
