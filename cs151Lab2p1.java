import java.util.Scanner;

public class cs151Lab2p1 {
	
	public static void main(String[] args) {
		
		int qtrs, dimes, nickles, pennies;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter # of quarters: ");
		qtrs = keyboard.nextInt();
		System.out.println("Enter # of dimes: ");
		dimes = keyboard.nextInt();
		System.out.println("Enter # of nickles: ");
		nickles = keyboard.nextInt();
		System.out.println("Enter # of pennies: ");
		pennies = keyboard.nextInt();
		
		compute(qtrs, dimes, nickles, pennies);

	} // close main()
	
	public static void compute(int q, int d, int n, int p){
		int totalCents = (q*25) + (d*10) + (n*5) + (p*1);
		int numDollars = totalCents/100;
		int numCents = totalCents%100;
		System.out.printf("The total comes to %d dollar(s) and %d cent(s).", numDollars, numCents);
		
	} // close compute()

} // close class
