package workshop6.exception;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account;
		account=new Account("441-0290-1203",500000,7.3);
		System.out.printf("계좌정보: %s %.1f %.1f",account.getAccount(),account.getBalance(),account.getInterestRate());
		System.out.println();

		try{
		account.deposit(-10);
	}
		catch(Exception e){
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		
		try{
			account.withdraw(600000);
		}
		catch(Exception e){
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		System.out.printf("이자: %.1f",account.calculateInterest());
		
		
	

}
}