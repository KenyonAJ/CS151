import java.util.Scanner;

public class cs151Lab3p6 {
	
	public static void main(String[] args) {
		
		int total = 0;
		int userInput = 0;
		
		System.out.println("Enter an integer between 1 - 5: ");
		while (!(total > 21)){
			userInput = getInput();
			total = total + userInput;
			if (total <= 21){
				System.out.println("Hit me!");
			}
		}
		System.out.printf("With your entry of %d you went OVER 21.\n", userInput);
		System.out.printf("Your total came to: %d.", total);
		
	} // close main()

	public static int getInput(){
		Scanner keyboard = new Scanner(System.in);
		int userInput;
		while (!keyboard.hasNextInt()){
			System.out.println("Please reply with an integer.  Try again: ");
			keyboard.next();
		}
		userInput = keyboard.nextInt();
		checkInput(userInput);
		return userInput;
	} // close getInput()
	
	public static void checkInput(int x){
		if ( x >= 1 && x <= 5 ){
			return;
		}
		else {
			System.out.println("You did not enter a valid range.  Try again: ");
			getInput();
		}
	} // close checkInput()
	
} // close class
