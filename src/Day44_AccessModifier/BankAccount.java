package Day44_AccessModifier;

public class BankAccount {
/*
 
 */
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	private double Deposit;
	
	//getter
	public String getAccountHolder () {
		return AccountHolder;
	}
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder = AccountHolder;
	}
	
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	public void setAvalaibleBalance(double AvailableBalance) {
		this.AvailableBalance = AvailableBalance;
	}
	
	//Actions:
	//		deposit:
				public void setDeposit(double amount) {
					AvailableBalance += amount;
				}
				
				//withdraw:
				public void WithDraw (double amount) {
					if(AvailableBalance<=0) {
						System.out.println("hohohoh");
						return;
					}
					if(amount>AvailableBalance) {
						AvailableBalance -= 35;
					}
					AvailableBalance -= amount;
					
				}
				
		// checking available balance:
				public void ShowBalance() {
					System.out.println("Available balance is : " + AvailableBalance);
				}
				
				//get info:
				public void getAccountInfo() {
				System.out.println("Name: "+getAccountHolder());
				System.out.println("Account Number: "+ getAccountNumber());
				System.out.println("Available Balance: "+ getAvailableBalance());
				}
	
				
}
