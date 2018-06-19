package day4;
public class ArrayTest4 {
	public static void main(String[] args) {
		int nums[]={10,5,7,15,12,20,14,8,25,19};//배열만들기
		System.out.println(nums[0]);//첫번째원소 출력
		System.out.println(nums[9]);//=nums[nums.length-1] 마지막원소 출력
	
		//첫번째 원소부터 마지막까지 출력
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		//마지막원소부터 첫번쨰 원소까지 출력
		for(int i=(nums.length-1);i>=0;i--)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		//홀수번째 원소값만 한행에 출력->이때 홀수번째는 인덱스로는 짝수!! 0부터 시작하는것 주의
		for(int i=0;i<nums.length;i+=2)
			System.out.print(nums[i]+"\t");
		System.out.println();
		
		
		//nums원소들 중에서 최고값을 추출하여 maxNum에 저장
		int maxNum=nums[0];
		for(int i=0;i<nums.length;i++){
			if(maxNum<nums[i])
				maxNum=nums[i];
		}
		System.out.println("원소들 중에서 최고값 : "+ maxNum);
		
		
		//nums원소들 중에서 최소값을 추출하여 maxNum에 저장
		int minNum=nums[0];
		for(int i=0;i<nums.length;i++){
			if(minNum>nums[i])
				minNum=nums[i];
		}
		System.out.println("원소들 중에서 최소값 : "+ minNum);
		}
	}


