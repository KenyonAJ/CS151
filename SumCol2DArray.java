
public class SumCol2DArray {

	
	public static void main(String[] args) {
		
		int[][] numbers = {{ 1, 2, 3, 4 },
				           { 5, 6, 7, 8 },
				           { 9,10,11,12 }};
		int total; // accumulator
		
		for (int col = 0; col < numbers[0].length; col++){
			// set accumulator to zero
			total = 0;
			
			// sum a column
			for (int row = 0; row < numbers.length; row++)
				total += numbers[row][col];
			
			// display the columns total
			System.out.println("Total of column " + col + " is " + total);
		}

	}

}
