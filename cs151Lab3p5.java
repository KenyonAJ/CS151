import java.util.Scanner;

public class cs151Lab3p5 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int userInput; 
		int count = 0;
		
		System.out.println("Enter a positive integer value to begin sequence: ");
		while (!keyboard.hasNextInt()){
			System.out.println("Please reply with an integer.  Try again: ");
			keyboard.next();
		}
		userInput = keyboard.nextInt();
		if (userInput < 0){
			userInput = userInput * -1;
		}
		while (userInput != 1){
			if (userInput%2 == 0){
				userInput = userInput/2;
			}
			else {
				userInput = (userInput * 3) + 1;
			}
			System.out.print(userInput + "\t");
			count++;
			if (count%10 == 0){
				System.out.println();
			}
		}
	} // close main()
} // close class
