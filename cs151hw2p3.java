import java.util.Scanner;
import java.text.DecimalFormat;

public class cs151hw2p3 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
				
		double radius, volume, surfArea;
		
		System.out.println("Enter radius: ");
		while (!keyboard.hasNextDouble()){
			System.out.println("Please use a number.  Try again: ");
			keyboard.next();
		}
		radius = keyboard.nextDouble();
		if (radius < 0){
			radius = radius * -1;
		}
		
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		surfArea = 4 * Math.PI * Math.pow(radius, 2);
		
		System.out.printf("The volume = %s, and the surface area = %s.", df.format(volume), df.format(surfArea));
	} // close main()

} // close class
