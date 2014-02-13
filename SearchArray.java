
public class SearchArray {

	
	public static void main(String[] args) {
		
		int[] tests = { 87, 75, 98, 100, 82};
		int results;
		
		// search the array for the value 100
		results = sequentialSearch(tests, 100);
		
		// Determine whether 100 was found and display appropriate message
		if (results == -1)
			System.out.println("You did not earn 100 on any test.");
		else
			System.out.println("You earned 100 on test " + (results + 1));
	} // close main()
	
	public static int sequentialSearch(int[] array, int value){
		
		int index; // loop control
		int element; // element the value is found at
		boolean found; // flag indicating search results
		
		// element 0 is the starting point of the search
		index = 0;
		
		// store the default values element and found
		element = -1;
		found = false;
		
		// search the array
		while (!found && index < array.length){
			if (array[index] == value){
				found = true;
				element = index;
			} // close if loop
			index++;
		} // close while loop
		
		return element;
	} // close sequentialSearch()
	

}
