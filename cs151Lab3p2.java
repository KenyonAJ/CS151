import java.util.Scanner;

public class cs151Lab3p2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean rain = false;
		int temp;
		String y_or_n;
		
		System.out.println("Is it raining?");
		y_or_n = keyboard.nextLine();
		y_or_n = y_or_n.toLowerCase();
		while (y_or_n.charAt(0) != 'y' && y_or_n.charAt(0) != 'n'){
			System.out.println("You did not enter response starting with the letters Y or N, try agian: ");
			y_or_n = keyboard.nextLine();
			y_or_n = y_or_n.toLowerCase();
		}
		if (y_or_n.charAt(0) == 'y'){
			rain = true;
		}
				
		System.out.println("Please enter temperature in degrees fahrenheit: ");
		temp = getTemp();
		
		gear(rain, temp);
		
	} // close main()
	
	public static void gear (boolean x, int t){
		if (x == true){
			if (t < 60)
				System.out.println("Wear raincoat and bring umbrella.");
			if (t >= 60 && t < 70)
				System.out.println("Wear jacket and bring umbrella.");
			if (t >= 70)
				System.out.println("Bring umbrella.");
			}
		else if (x == false && t < 70){
			if (t < 60)
				System.out.println("Wear overcoat.");
			else
				System.out.println("Wear jacket.");
			}
		else
			System.out.println("No worries, mate!");
	} // close gear()

	public static int getTemp (){
		Scanner kb = new Scanner(System.in);
		int valid_input;
		while (!kb.hasNextInt()){
			System.out.println("Please reply with an integer.  Try again: ");
			kb.next();
		}
		valid_input = kb.nextInt();
		return valid_input;
	} // close getTemp()
	
} // close class
