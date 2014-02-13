
public class SelectionSortDemo {

// Unfixed error	
	public static void main(String[] args) {
		
		int[] testArray = { 5, 3, 99, -3, 45, 66, 83, 0 };
		int[] sortedArray;
		
		
		SelectionSortAlgo sort = new SelectionSortAlgo();
		
		sortedArray = sort.selectionSort(testArray);
		
		System.out.println(sortedArray);  // actually prints garbage, not what was expected
		
		

	}

}
