package day6;
import day5.MethodLab3;// 다른 패키지 메소드 쓸때 쓰는 방법, 여러번 가져다 쓸거면 앞 import문 이용
public class MethodTest5 {
	public static void main(String[] args) {
		
		printNumbers(new int[0]);
		printNumbers(new int[3]);
		printNumbers(new int[]{111,222});
		
		int [] result = getNumbers(20,20);//1부터 20까지 난수 20개를 배열로 리턴
		printNumbers(result);
		
		result = getNumbers(10,10);
		printNumbers(result);
		
		printNumbers(getNumbers(5,5));//result 대신 직접 넣어도됨
			
	}
	
	
	//1부터 limit값까지의 난수를 count갯수만큼 배열로 리턴
	public static int[] getNumbers(int count, int limit){
		int nums[]=new int[count];
		for(int i=0;i<nums.length;i++)
			nums[i] =MethodLab3.getRandom(limit);
		  //nums[i] =day5.MethodLab3.getRandom(limit);//같은 패키지,클래스가 아니면 메소드를 쓰기위해 앞에 패키지.클래스. 붙여줘야함
		return nums;
	}
	
	public static void printNumbers(int nums[]){
		if(nums.length==0){
			System.out.println("원소가 없구만요!!");
			return;//원소가 없으면 아래로 안가고 되돌아가라		
		}
		
		for(int num : nums)//강화 for문
			System.out.print(num + " ");
		System.out.println();
		return;//return할 데이터가 없으면 걍 return문만 써도됨, 있으나마나
		
	}

}
