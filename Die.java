import java.util.Random;


public class Die {
	
	private int sides; // Number of sides
	private int value; // The die's value
	
	// Constructor performs an initial roll of the die
	public Die(int numSides){
		sides = numSides;
		roll();
	}
	
	// roll() simulates the rolling of the die
	public void roll(){
		// Create a Random object
		Random rand = new Random();
		
		// Get a random value for the die
		value = rand.nextInt(sides) ;
	} // Close roll()
	
	// getSides() returns number of sides for this die
	public int getSides(){
		return sides;
	} // close getSides()
	
	// getValue() returns the value of the die
	public int getValue(){
		return value;
	} // close getValue()

} // Close class
