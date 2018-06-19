package day11;

public class LottoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LottoMachine newLott = new LottoMachine();
		try {
			newLott.creatLottoNums();
			newLott.checkLottoNums();

		} catch (DuplicateException e) {

			System.out.println(e.getMessage());
			return;

		}

		int[] n = newLott.getNums();
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
			if (i != n.length - 1) {
				System.out.print(", ");

			}//return문 안쓰려면 밑에 출력제어문을 try안에다 넣고 return 지우면 됨

		}
	}
}
