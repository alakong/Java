package day11;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");
	}
}

public class LottoMachine {
	private int[] nums;

	public LottoMachine() {
		nums = new int[6];
	}

	public void creatLottoNums() {
		
		Random r =new Random();//객체생성은 반복문안에다 되도록 하지말것
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(20)+1;//1부터 20사이
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
