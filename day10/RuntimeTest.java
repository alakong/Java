package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();//��ü����
		//r.exec("c:\\windows\\notepad.exe");//�޸����� ����,\�� �����ϸ� �ι��� ����� �ƴϸ� �׳�/�� �Ѱ� �൵��
		
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);//������Ѻ��� ��ü�� �ϳ��� �����������-> Runtime�� singleton������ ����� Ŭ�����̹Ƿ�
		
		
	}

}
