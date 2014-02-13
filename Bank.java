import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	
	Scanner keyboard = new Scanner(System.in);
	private int counter = 0;
	ArrayList<Account> bank = new ArrayList<>(30);
	
	public void createAccount () {
		
		if (counter > 30) {
			System.out.println("This branch is currently serving its maximum capacity.");
		}
		
		if (counter <= 30) {
		
			System.out.println("Please enter name of account holder \"FirstName LastName\": ");
			String name = keyboard.nextLine();
		
			System.out.println("Please enter account number: ");
			long accountNumber = keyboard.nextLong();
			keyboard.nextLine(); // consume the newline
		
			System.out.println("Is there an initial balance? (Yes, No): ");
			
			String response = keyboard.nextLine();
			response = response.toLowerCase();
			double balance = 0;
		if (response.charAt(0) == 'n') {
			balance = 0;
		}
		if (response.charAt(0) == 'y') {
			System.out.println("Enter balance: ");
			balance = keyboard.nextDouble();
		}
		// if (response.charAt(0) != 'n' || response.charAt(0) != 'y') {
		// 	System.out.println("The system did not understand your input.  Setting initial balance to zero.");
		// 	balance = 0;
		// }
		
		Account newAcct = new Account (name, accountNumber, balance);
		// for (int j = 0; j < 30; j++) {
		// 	if (bank.get(j) == null) {
		// 		bank.add(j, newAcct);
		// 		break;
		// 	}
		// }
		bank.add(counter, newAcct); // probably need to fix this to set at 1st null in ArrayList
		counter++;
		}
		
	} // close createAccount()

	public void closeAccount () {
		System.out.println("Enter the account number to be closed: ");
		long acctNum = keyboard.nextLong();
		for (int i = 0; i < bank.size(); i++) {
			if (bank.get(i).getAcctNumber() == acctNum) {
				bank.remove(i);
				System.out.println("Account number " + acctNum + " has been closed.");
				counter--;
			}
		}
	} // close closeAccount
	
} // close class
