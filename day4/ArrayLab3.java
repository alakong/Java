package day4;

public class ArrayLab3 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		char[] munja = new char[10];//=new char[nums.length]
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 26) + 1;
			munja[i] = (char) (nums[i] + 64);
			System.out.print(nums[i]);
			if(i!=nums.length-1)System.out.print(",");
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(munja[i] );
			if(i!=munja.length-1)System.out.print(",");
		}

	}
}