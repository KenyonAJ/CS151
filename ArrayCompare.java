
public class ArrayCompare {

	
	public static void main(String[] args) {
		// make a couple of arrays to compare
		int[] firstArray = { 2, 3, 6, 8, 10};
		int[] secondArray = { 2, 4, 6, 8, 10};
		
		boolean arraysEqual = true; // flag variable
		int index = 0;  // loop control variable
		
		// first determine whether the arrays are the same size
		if (firstArray.length != secondArray.length)
			arraysEqual = false;
		
		// determine whether the elements contain the same data
		while (arraysEqual && index < firstArray.length){
			if (firstArray[index] != secondArray[index])
				arraysEqual = false;
			index++;
		} // close while loop
		
		if (arraysEqual)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are not equal.");
	}

}
