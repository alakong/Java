package day5;

public class MethodTest3 {
	public static void main(String[] args) {
	System.out.println("main() �޼��� ���� ����");
    char result = (char)addNumber();//Ÿ���� ���� �ٸ��� ����ȯ �ʿ�
	System.out.println("ȣ�� �����1 : " + result);//������ ����� ���� ���� �ȿ� �־���� ����ϴ� ���� ����
	System.out.println("ȣ�� �����2 : " + result);
	System.out.println("ȣ�� �����3 : " + result);
	/*System.out.println("ȣ�� �����1 : " + addNumber());
	System.out.println("ȣ�� �����2 : " + addNumber());
	System.out.println("ȣ�� �����3 : " + addNumber());*/
	System.out.println("main() �޼��� ���� ����");
	}
	public static int addNumber(){//�Ű����� ����, ���ϰ��� Ÿ���� ���ϵǴ� ������� ���� Ÿ������ 
		return 28+20;
				}
	}


