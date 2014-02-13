import java.util.Scanner;

public class cs151hw4p2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double a, b, c;
		boolean flag = false;
		
		System.out.println("Enter side a: ");
		a = keyboard.nextDouble();
		System.out.println("Enter side b: ");
		b = keyboard.nextDouble();
		System.out.println("Enter side c: ");
		c = keyboard.nextDouble();
		
		Triangle tri = new Triangle(a, b, c);
		flag = tri.isRight();
		
		if (flag)
			System.out.println("Is-test: True");
		else
			System.out.println("No is-test or returned False");

	}

}
