
public class SelectionSortAlgo {
	
	public static int[] selectionSort(int[] array){
		
		int startScan, index, minIndex, minValue;
		
		for (startScan = 0; startScan < (array.length-1); startScan++){
			
			minIndex = startScan;
			minValue = array[startScan];
			for (index = startScan + 1; index < array.length; index++){
				
				if (array[index] < minValue){
					
					minValue = array[index];
					minIndex = index;
				} // close if leep
			} // close inner for loop
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		} // close outer for loop
		return array;
	} // close selectionSort
	
}
