package day39_CustomClassContinue;

public class BankAccountObjects {
public static void main(String[] args) {
	
	BankAccount account1 = new BankAccount();
			account1.AccountHolder = "Erhan Dolapci";
			account1.AccountNumber = 1234567123456789L;
			account1.ShowBalance();
			account1.Deposit(2000);
			account1.Deposit(4000);
			account1.WithDraw(8111);
			
	BankAccount account2 = new BankAccount();
				account2.accountSetUp("Muaz Gulen", 2223333444555666L);
				account2.ShowBalance();
				account2.Deposit(1000000);
				account2.WithDraw(50000);
				
	BankAccount account3 = new BankAccount("Nadire Pilotttt", 3547583083874751L);
	account3.ShowBalance();
	
	account3.Deposit(10);
    account3.WithDraw(433);
	account3.Deposit(4234);
			
	
	
}
}
