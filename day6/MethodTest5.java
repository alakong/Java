package day6;
import day5.MethodLab3;// �ٸ� ��Ű�� �޼ҵ� ���� ���� ���, ������ ������ ���Ÿ� �� import�� �̿�
public class MethodTest5 {
	public static void main(String[] args) {
		
		printNumbers(new int[0]);
		printNumbers(new int[3]);
		printNumbers(new int[]{111,222});
		
		int [] result = getNumbers(20,20);//1���� 20���� ���� 20���� �迭�� ����
		printNumbers(result);
		
		result = getNumbers(10,10);
		printNumbers(result);
		
		printNumbers(getNumbers(5,5));//result ��� ���� �־��
			
	}
	
	
	//1���� limit�������� ������ count������ŭ �迭�� ����
	public static int[] getNumbers(int count, int limit){
		int nums[]=new int[count];
		for(int i=0;i<nums.length;i++)
			nums[i] =MethodLab3.getRandom(limit);
		  //nums[i] =day5.MethodLab3.getRandom(limit);//���� ��Ű��,Ŭ������ �ƴϸ� �޼ҵ带 �������� �տ� ��Ű��.Ŭ����. �ٿ������
		return nums;
	}
	
	public static void printNumbers(int nums[]){
		if(nums.length==0){
			System.out.println("���Ұ� ��������!!");
			return;//���Ұ� ������ �Ʒ��� �Ȱ��� �ǵ��ư���		
		}
		
		for(int num : nums)//��ȭ for��
			System.out.print(num + " ");
		System.out.println();
		return;//return�� �����Ͱ� ������ �� return���� �ᵵ��, ����������
		
	}

}
