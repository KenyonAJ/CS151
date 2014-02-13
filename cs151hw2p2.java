import java.util.Scanner;
import java.text.DecimalFormat;

public class cs151hw2p2 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		int x1, x2, y1, y2;
		double distance;
		
		System.out.println("Enter Cartesian P1(x,y):\nx1: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		x1 = keyboard.nextInt();
		
		System.out.println("y1: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		y1 = keyboard.nextInt();
		
		System.out.println("Enter Cartesian P2(x,y):\nx2: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		x2 = keyboard.nextInt();
		
		System.out.println("y2: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please use an integer.  Try again: ");
			keyboard.next();
		}
		y2 = keyboard.nextInt();
		
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("The distance between P1 and P2 is: %s.", df.format(distance));
		
	} // close main()

} // close class
