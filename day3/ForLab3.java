package day3;

public class ForLab3 {
	public static void main(String[] args) {
		for(int a=9;a>=5;a--){
			System.out.print(a+"�� : ");
			for(int num=1;num<=9;num++){
				System.out.print(a+"x"+num+"="+a*num+"\t");
			}
			System.out.println();
		}
	}

}
/*�ǽ�3 - ������ ���(for �� ���)
1. ForLab3 ��� Ŭ������ �����Ѵ�.
2. 9�ܺ��� 5�ܱ����� �������� ����Ѵ�. ��� ������ ������ ����.

   9�� : 9x1=9 	9x2=18	9x3=27	9x4=36	9x5=45	9x6=54 ....
   8�� : 8x1=8	8x2=16	8x3=24      ...
   7�� :
   6�� :
   5�� :
*/