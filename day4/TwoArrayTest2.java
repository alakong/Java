package day4;
public class TwoArrayTest2 {
	public static void main(String[] args) {
		int [][] nums = {
				             {1, 2, 3, 4}
				           , {5, 6, 7, 8}
				           , {9,10,11,12}
				           , {13,14,15,16}  //4��4��
		};
		
		// 2�� 3�� ����ϱ�//�ε��� 0���� ������!!!!!!!!!!!!�����ϱ�
		System.out.println(nums[1][2]);

		// 4�� ����ϱ�(�ϳ��� �࿡)
		for (int i = 0; i < nums[3].length; i++) {
			System.out.print(nums[3][i] + "\t");
		}
		System.out.println();

		// 3���� ��� ������ ��� �ϳ��� �ؿ�
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i][2] + "\t");
			System.out.println();
		}

		// ��� ��� ��� ���� ���(�� ������ ����ó��)
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		// ���� �밢���� ������ ���
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i == j) {
					System.out.print(nums[i][j] + "\t");
				}
			}
		}
		System.out.println();
		// ������ �밢���� ������ ���

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i + j == nums.length - 1) {
					System.out.print(nums[i][j] + "\t");// if(i+j==nums.length-1)
														// �࿭�� ���� ���� ũ��-1
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
