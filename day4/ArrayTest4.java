package day4;
public class ArrayTest4 {
	public static void main(String[] args) {
		int nums[]={10,5,7,15,12,20,14,8,25,19};//�迭�����
		System.out.println(nums[0]);//ù��°���� ���
		System.out.println(nums[9]);//=nums[nums.length-1] ���������� ���
	
		//ù��° ���Һ��� ���������� ���
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		//���������Һ��� ù���� ���ұ��� ���
		for(int i=(nums.length-1);i>=0;i--)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		//Ȧ����° ���Ұ��� ���࿡ ���->�̶� Ȧ����°�� �ε����δ� ¦��!! 0���� �����ϴ°� ����
		for(int i=0;i<nums.length;i+=2)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		
		//nums���ҵ� �߿��� �ְ��� �����Ͽ� maxNum�� ����
		int maxNum=nums[0];
		for(int i=0;i<nums.length;i++){
			if(maxNum<nums[i])
				maxNum=nums[i];
		}
		System.out.println("���ҵ� �߿��� �ְ� : "+ maxNum);
		
		
		//nums���ҵ� �߿��� �ּҰ��� �����Ͽ� maxNum�� ����
		int minNum=nums[0];
		for(int i=0;i<nums.length;i++){
			if(minNum>nums[i])
				minNum=nums[i];
		}
		System.out.println("���ҵ� �߿��� �ּҰ� : "+ minNum);
		}
	}


