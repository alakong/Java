package day3;

public class ForLab1 {
	public static void main(String[] args) {
		int count = (int) (Math.random() * 8) + 3;
		int deco = (int) (Math.random() * 3) + 1;
		if (deco == 1) {
			for (int i = 1; i <= count; i++)
				System.out.print("*");
		} else if (deco == 2) {
			for (int i = 1; i <= count; i++)
				System.out.print("$");
		} else {
			for (int i = 1; i <= count; i++)
				System.out.print("#");
		}
	}

}


/*�ǽ�1  
1. ForLab1 �̶�� Ŭ������ �����Ѵ�.
2. 3���� 10������ ������ �����Ѵ�.(count)
3. 1���� 3������ ������ �����Ѵ�.(deco)
4. deco�� 1�̸� "*"�� ù��° count ����ŭ ����Ѵ�.
    deco��  2�̸� "$"�� ù��° count ����ŭ ����Ѵ�.
    deco��  3�̸� "#"�� ù��° count ����ŭ ����Ѵ�.*/