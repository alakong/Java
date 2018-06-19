package day4;
public class TwoArrayTest2 {
	public static void main(String[] args) {
		int [][] nums = {
				             {1, 2, 3, 4}
				           , {5, 6, 7, 8}
				           , {9,10,11,12}
				           , {13,14,15,16}  //4행4열
		};
		
		// 2행 3열 출력하기//인덱스 0부터 시작함!!!!!!!!!!!!주의하기
		System.out.println(nums[1][2]);

		// 4행 출력하기(하나의 행에)
		for (int i = 0; i < nums[3].length; i++) {
			System.out.print(nums[3][i] + "\t");
		}
		System.out.println();

		// 3열의 모든 데이터 출력 하나의 해에
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i][2] + "\t");
			System.out.println();
		}

		// 모든 행과 모든 열을 출력(행 단위로 개행처리)
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		// 왼쪽 대각선의 값들을 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i == j) {
					System.out.print(nums[i][j] + "\t");
				}
			}
		}
		System.out.println();
		// 오른쪽 대각선의 값들을 출력

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i + j == nums.length - 1) {
					System.out.print(nums[i][j] + "\t");// if(i+j==nums.length-1)
														// 행열의 합은 행의 크기-1
				}
			}

		}
		
		System.out.println();
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
			if(i>j){sum+=nums[i][j];}	
			}
	}
		System.out.println(sum);

	}
}
