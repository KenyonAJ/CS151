import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SalesReport {

	
	public static void main(String[] args) throws IOException {
		
		final int NUM_DAYS = 30; // Number of days of sales
		String filename;		 // The name of the file to open
		double totalSales;		 // Total sales for period
		double averageSales;	 // Average daily sales
		
		// Get the name of the file
		filename = getFileName();
		
		// Get the total sales from the file
		totalSales = getTotalSales(filename);
		
		// Calculate the average
		averageSales = totalSales / NUM_DAYS;
		
		// Display the total and average
		displayResults(totalSales, averageSales);
		
		System.exit(0);
		
		} // close Main
	
	public static String getFileName(){
		String file;		 // To hold the file name
		
		// Prompt the user to enter a file name
		file = JOptionPane.showInputDialog("Enter the name of the file.");
		
		// Return the name
		return file;
	} // close getFileName()
	
	public static double getTotalSales(String filename) throws IOException {
		double total = 0.0;   // Accumulator
		double sales; 		  // A daily sales amount
		
		// Open the file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		// This loop processes the lines read from the file,
		// until the end of the file is encountered
		while (inputFile.hasNext()){
			// Read a double from the file
			sales = inputFile.nextDouble();
			
			// Add sales to the value already in total
			total += sales;} // close while loop
		
		// Close the file
		inputFile.close();
		
		// Return the total sales
		return total;
		} // close getTotalSales()
	
	public static void displayResults(double total, double avg){
		// Create a DecimalFormat object capable of formatting a dollar amount
		DecimalFormat dollar = new DecimalFormat("#,###.00");
		
		// Display the total and average sales
		JOptionPane.showMessageDialog(null, "The total sales for " +
									"the period is $" + dollar.format(total) +
									"\nThe average daily sales were $" +
									dollar.format(avg));
	} // close displayResults()

} // close Class
