
public class SalesData {
	
	private double[] sales;  // the sales data
	
	// constructor copies elements in an array to the sales array
	public SalesData(double[] s){
		// create an array as large as "s"
		sales = new double[s.length];
		
		// copy the elements from s to sales
		for (int index = 0; index < s.length; index++)
			sales[index] = s[index];
	}
	
	// getTotal method returns total of elements in the array
	public double getTotal(){
		double total = 0.0;  // accumulator
		
		// accumulate the sum of the elements
		for (int index = 0; index < sales.length; index++)
			total += sales[index];
		
		// return the total
		return total;
	}
	
	// getAverage method returns the average of the elements in the array
	public double getAverage(){
		return getTotal() / sales.length;
	}
	
	// getHighest method return the highest value stored in the array
	public double getHighest(){
		double highest = sales[0];
		// start with index = 1, since index = 0 is already stored in highest
		for (int index = 1; index < sales.length; index++){
			if (sales[index] > highest)
				highest = sales[index];
		}
		return highest;
	}
	
	// getLowest method return the lowest value stored in the array
	public double getLowest(){
		double lowest = sales[0];
		// start with index = 1, since index = 0 is already stored in lowest
		for (int index = 1; index < sales.length; index++){
			if (sales[index] < lowest)
				lowest = sales[index];
		}
		return lowest;
	}

}
