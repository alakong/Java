package workshop6.exception;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account;
		account=new Account("441-0290-1203",500000,7.3);
		System.out.printf("��������: %s %.1f %.1f",account.getAccount(),account.getBalance(),account.getInterestRate());
		System.out.println();

		try{
		account.deposit(-10);
	}
		catch(Exception e){
			System.out.println("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		
		try{
			account.withdraw(600000);
		}
		catch(Exception e){
			System.out.println("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}
		System.out.printf("����: %.1f",account.calculateInterest());
		
		
	

}
}