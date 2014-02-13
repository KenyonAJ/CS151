import java.util.Scanner;

public class cs151hw6p2 {
	
	public static void main(String[] args) {
		
		Bank LL = new Bank();
		
		LL.createAccount();
		
		System.out.println(LL.bank.get(0).getBalance());
		
		LL.bank.get(0).deposit(30000);
		System.out.println(LL.bank.get(0).getBalance());
		
		LL.bank.get(0).addInterest();
		System.out.println(LL.bank.get(0).getBalance());
		
		
		
		
	}

}
