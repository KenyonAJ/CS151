
public class DieArgument {

	
	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		// Create a 6-sided die
		Die sixDie = new Die(SIX_SIDES);
		
		// Create a 20-sided die
		Die twentyDie = new Die(TWENTY_SIDES);
		
		// Roll the dice
		rollDie(sixDie);
		rollDie(twentyDie);
		
	} // close main()
	
	public static void rollDie(Die d){
		// Display the number of sides
		System.out.println("Rolling a " + d.getSides() + " sided die.");
		// Roll the die
		d.roll();
		
		// Display the die's value
		System.out.println("The die's value: " + d.getValue());
	} // close rollDie()

} // close class
