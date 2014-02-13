import java.text.NumberFormat;

public class Account {
	
	private final double RATE = 0.03; // interest rate of 3%
	
	private long acctNumber;
	private double balance;
	private String name;
	
	
	public Account (String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	public double deposit (double amount) {
		if (amount >= 0) {
			balance = balance + amount;
			return balance;
		}
		else {
			System.out.println("The amount entered is less than zero, i.e. a withdrawal.  Transaction denied.");
			return balance;
		}
	}
	
	public double withdraw (double amount, double fee) {
		if ((balance - amount - fee) >= 0) {
			balance = balance - amount - fee;
			return balance;
		}
		else {
			System.out.println("Withdrawing that amount will result in overdraft.  Transaction denied.");
			return balance;
		}
			
		
	}
	
	public double addInterest () {
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public long getAcctNumber () {
		return acctNumber;
	}
	
	public String toString () {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
	

}
