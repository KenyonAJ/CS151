import java.util.Scanner;

public class CorpSales {
	
	public static void main(String[] args) {
		
		final int DIVS = 3; // rows
		final int QTRS = 4; // columns
		double totalSales = 0.0; // accumulator
		
		// create an array to hold the sales for each division (row), each quarter (col)
		double[][] sales = new double[DIVS][QTRS];
		
		// create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// display an introduction
		System.out.println("This program will calculate the total sales of");
		System.out.println("all the company's divisions.  Enter the following sales data: ");
		
		// nested loops to fill the array
		for (int div = 0; div < DIVS; div++){
			for (int qtr = 0; qtr < QTRS; qtr++){
				System.out.printf("Division %d, Quarter %d: $",
						(div + 1), (qtr + 1));
				sales[div][qtr] = keyboard.nextDouble();
			} // close inner for loop
			System.out.println(); // print blank line
		} // close outer for loop
		
		// nested loops to add all the elements in the array
		for (int div = 0; div < DIVS; div++){
			for (int qtr = 0; qtr < QTRS; qtr++){
				totalSales += sales[div][qtr];
			} // close inner for loop
		} // close outer for loop
		
		// display the total sales
		System.out.printf("Total company sales: $%, .2f\n", totalSales);
	}

}
