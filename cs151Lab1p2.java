import java.util.Scanner;

public class cs151Lab1p2 {
	
	public static void main(String[] args) {
		
		final double Y2M = 0.8;
		int yW, yL, hW, hL;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter yard width: ");
		yW = keyboard.nextInt();
		while (yW < 0){
			System.out.println("No negs, try again: ");
			yW = keyboard.nextInt();
		}
		System.out.println("Please enter yard length: ");
		yL = keyboard.nextInt();
		while (yL < 0){
			System.out.println("No negs, try again: ");
			yL = keyboard.nextInt();
		}
		System.out.println("Please enter house width: ");
		hW = keyboard.nextInt();
		while (hW < 0){
			System.out.println("No negs, try again: ");
			hW = keyboard.nextInt();
		}
		System.out.println("Please enter house length: ");
		hL = keyboard.nextInt();
		while (hL < 0){
			System.out.println("No negs, try again: ");
			hL = keyboard.nextInt();
		}
		
		int yArea = yardArea(yW, yL);
		int hArea = houseArea(hW, hL);
		int gArea = grassArea(yArea, hArea);
		double gasm = grassAreaInSqM(gArea, Y2M);
		double tis = timeInSec(gasm);
		
		System.out.printf("The time in minutes is: %.2f\n", timeInMin(timeInSec(grassAreaInSqM(grassArea(yardArea(yW, yL), houseArea(hW, hL)), Y2M))));
		
	} // close main()
	
	public static int yardArea(int a, int b){
		return (a*b);
	} // close yardArea()
	
	public static int houseArea(int a, int b){
		return (a*b);
	} // close houseArea
	
	public static int grassArea(int a, int b){
		return (a - b);
	} // close grassArea()
	
	public static double grassAreaInSqM(int a, double b){
		return (a*b);
	} // close grassAreaInSqM()
	
	public static double timeInSec(double a){
		return (a/2.0);
	} // close timeInSec()
	
	public static double timeInMin(double a){
		return (a/60.0);
	} // close timeInMin()

} // close class
