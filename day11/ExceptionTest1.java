package day11;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception {// ����ó������
		// TODO Auto-generated method stub
		System.out.println("�������");
		try {//���ܰ� �߻��� ���ִ� ���� ���๮����� �־���°�. ���� �߻� ���ϴ� ���� �־ ����� ����
			//������ ���ܰ� �߻��� �� �ִ� ������ �ּ��� �ϳ� �̻� �־����.
			int num1 = Integer.parseInt(args[0]);// Integer.parseInt()
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("���� ��� :" + result);
		} /* catch (ArrayIndexOutOfBoundsException e) {//�ϳ��� try���� catch���� 0���̻� ���� �� ����.
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���.");//���� �߻� �� ó���� �ڵ�(0�� �̻��� ���๮��)
		}*/ catch (ArithmeticException e) {//���⼭ e�� Ŭ���� �̸��� ���� ��
			System.out.println("�ι�° ���ڴ� 0�ϼ� �����.");
			/*System.out.println(e.getMessage());
			System.out.println(e);*/
			e.printStackTrace();//�����߻� ������ �߻����ۺ��� �Ųٷ� ã�ƿö󰡴°� �������
			return;//ȣ���� ������ �ǵ��ư�->���ο����� ���α׷����� ����/�̶��� finally�� ���������� �����ϰ� ����
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			e.printStackTrace();
		}catch (Exception e) {//���� �ֵ��� �� �����ϴ� Ŭ�����̹Ƿ� �� �Ʒ��� �ξ�� �����ֵ��� �����
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���.");
		}finally {//try���� finally�� �Ѱ��� ���ų� ������ �� ����.���� �߻� ���� ������� ������ ����
			System.out.println("�� ���� �ݵ�� �����մϴٿ�..");

		}//������ try �ڿ� catch, finally ���߿� �ϳ��� �־����!!!!!!!!!
		System.out.println("��������");

	}
}
