package day5;
public class MethodLab1 {
	public static void main(String[] args) {
		munNum('@',3);
		munNum('%',4);
		munNum('A',5);
		munNum('��',3);
	}
	public static void munNum(char a, int n){
		for(int i=1;i<=n;i++){
		System.out.print(a);}
		System.out.println();
		
	}
	

}

/*[ �ǽ� 1 ]
1. Ŭ������ : MethodLab1

2. �����ؾ� �ϴ� �߰� �޼��� (public static �ٿ���)
   �Ű����� : char Ÿ�� 1��, int Ÿ�� 1 �� 
   ���ϰ� : ����
   �޼���� : ���Ƿ�
   ��� : ù��° �ƱԸ�Ʈ�� ���޵� ���ڸ� 
            �ι�° �ƱԸ�Ʈ�� ���޵� ������ ������ŭ 
            �� �࿡ ����Ѵ�.
3. main() �޼��忡���� ������ ���� �ƱԸ�Ʈ�� �����ϸ鼭
    ���� ������ �޼��带 ȣ���Ѵ�.

     xxxx('@', 3)
     xxxx('%', 4)
     xxxx('A', 5)
     xxxx('��', 3)


    ���
         @@@
         %%%%
         AAAAA  
         ������
*/