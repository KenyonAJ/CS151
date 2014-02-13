import java.util.Scanner;

public class cs151Lab1p1 {
	
	final static int FLOWRATE = 70;
	final static double CAPACITY = 7.48;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		// final int FLOWRATE = 70;
		// final double CAPACITY = 7.48;
		int length, width, depth;
				
		System.out.println("Enter length: ");
		length = keyboard.nextInt();
		while (length < 0){
			System.out.println("Can not be negative, please try again: ");
			length = keyboard.nextInt();
		}
		System.out.println("Enter width: ");
		width = keyboard.nextInt();
		while (width < 0){
			System.out.println("Can not be negative, please try again: ");
			width = keyboard.nextInt();
		}
		System.out.println("Enter depth: ");
		depth = keyboard.nextInt();
		while (depth < 0){
			System.out.println("Can not be negative, please try again: ");
			depth = keyboard.nextInt();
		}
		
		System.out.printf("The time in minutes to fill the pool is: %.2f\n", timeInMin(poolCapacity(CAPACITY, volume(length, width, depth)), FLOWRATE));
								
	} // close main()
	
	public static int volume(int a, int b, int c){
		return (a*b*c);
	} // close volume()
	
	public static double poolCapacity(double a, double b){
		return (a*b);
	} // close poolCapacity()
	
	public static double timeInMin(double a, int b){
		return (a/b);
	} // close timeInMin()

} // close class
