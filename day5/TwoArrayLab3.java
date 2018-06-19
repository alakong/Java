package day5;
public class TwoArrayLab3 {
	public static void main(String[] args) {
		int[][] num={
				        {10,20,30,40,50}
				       ,{5,10,15}
				       ,{11,22,33,44}
				       ,{9,8,7,6,5,4,3,2,1}
				       };
		
		int sum;
		for (int i = 0; i < num.length; i++) {
			sum = 0;
			for (int j = 0; j < num[i].length; j++) {//for(int nu:arr[i]){sum+=nu;}
				sum += num[i][j];
			}
			System.out.println((i + 1) + "행의 합은 " + sum + " 입니다.");
		}

	}

}
