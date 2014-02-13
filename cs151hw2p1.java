import java.util.Scanner;

public class cs151hw2p1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int hours, minutes, seconds, totalSeconds;
		
		System.out.println("Please enter hours: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		hours = keyboard.nextInt();
		
		System.out.println("Please enter minutes: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		minutes = keyboard.nextInt();
		
		System.out.println("Please enter seconds: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		seconds = keyboard.nextInt();
		
		totalSeconds = seconds + (minutes * 60) + (hours * 3600);
		
		System.out.printf("The equivalent number of seconds is: %d.", totalSeconds);
		
						
	} // close main()

} // close class
