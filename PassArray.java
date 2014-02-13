import java.util.Scanner;

public class PassArray {
	
	public static void main(String[] args) {
		
		final int ARRAY_SIZE = 4;
		
		// create an array
		int[] numbers = new int[ARRAY_SIZE];
		
		// pass array to the getValues method
		getValues(numbers);
		
		System.out.println("Here are the numbers that you entered: ");
		
		// pass the array to the showArray method
		showArray(numbers);
		
	} // close main()
	
private static void getValues(int[] array){
	// Create scanner object to get inputs from user
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a series of " + array.length + " numbers.");
	
	// read values into array
	for (int index = 0; index < array.length; index++){
		System.out.print("Enter number " + (index + 1) + ": ");
		array[index] = keyboard.nextInt();
	} // close loop
} // close getValues()

public static void showArray(int[] array){
	// display the array elements
	for (int index = 0; index < array.length; index++)
		System.out.println(array[index] + " ");
} // close showArray()

} // close class
