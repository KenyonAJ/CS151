
public class SumRow2DArray {

	
	public static void main(String[] args) {
		
		int[][] numbers = {{ 1, 2, 3, 4 },
						   { 5, 6, 7, 8 },
						   { 9, 10, 11, 12}};
		
		int total; // accumulator
		for (int row = 0; row < numbers.length; row++){
			// set accumulator to zero
			total = 0;
			// sum a row
			for (int col = 0; col < numbers[row].length; col++)
				total += numbers[row][col];
			
			// display the row's total
			System.out.println("Total of row " + row + " is " + total);
		}

	}

}
