import java.util.Scanner;

public class cs151Lab2p2 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double interest, principal, d_rate, d_time;
		int rate, time;
		
		System.out.println("Enter principal: ");
		principal = keyboard.nextDouble();
		System.out.println("Enter rate: ");
		rate = keyboard.nextInt();
		d_rate = rate/100.0;
		System.out.println("Enter time: ");
		time = keyboard.nextInt();
		d_time = time/365.0;
		
		interest = principal*d_rate*d_time;
		
		System.out.printf("The interest is: $%f", interest);		

	} // close main()

} // close class
