package day11;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
	}
}

public class LottoMachine {
	private int[] nums;

	public LottoMachine() {
		nums = new int[6];
	}

	public void creatLottoNums() {
		
		Random r =new Random();//��ü������ �ݺ����ȿ��� �ǵ��� ��������
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(20)+1;//1���� 20����
		}
	}

	public void checkLottoNums() throws DuplicateException {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j])
					throw new DuplicateException();
			}
		}
	}

	public int[] getNums() {
		return nums;
	}
}
