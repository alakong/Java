package day4;

public class ArrayLab1 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int sum = 0;
		System.out.print("모든 원소의 값 : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 17) + 4;//17을 곱했을 때 0~16까지임
			sum += nums[i];
			System.out.print(nums[i]);
			if(i!=nums.length-1)System.out.print(",");
		}
		System.out.println();
		System.out.println("모든 원소의 합 : " + sum);
	}

}
