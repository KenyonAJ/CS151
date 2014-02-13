import java.util.ArrayList;

public class Quiz {
	
	public static void main(String[] args) {
		
		// int[] a = {1, 3, 5, 7, 9};
		// int[] b = {2, 4, 6, 8};
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		a.add(new Integer(1));
		a.add(new Integer(3));
		a.add(new Integer(5));
		a.add(new Integer(7));
		a.add(new Integer(9));
		
		b.add(new Integer(2));
		b.add(new Integer(4));
		b.add(new Integer(6));
		b.add(new Integer(8));
		
		
		double[] dd = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		double arraySum = sumArray(dd);
		
		System.out.println(arraySum);
		
		switchThem (a, b);
		
		for (int newa : a)
			System.out.print(newa + "\t");
		
		System.out.println();
		
		for (int newb : b)
			System.out.print(newb + "\t");
			
	} // close main()
	
	static double sumArray (double[] stuff) {
		
		double total = 0;
		for (double things : stuff)
			total += things;
		return total;
	} // close sumArray()
	
	static void switchThem (ArrayList a, ArrayList b) {
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		int lena = a.size();
		int lenb = b.size();
		
				
		for (int i = 0; i < lena; i++) {
			int temp = (int) a.get(i);
			c.add(temp);
		}
		
		for (int j = 0; j < lenb; j++) {
			Integer temp2 = (int) b.get(j);
						
			if (j < lena)
				a.set(j, temp2);
			else
				a.add(j, temp2);
		}
		
		for (int k = 0; k < lena; k++) {
			Integer temp3 = (int) c.get(k);
			if (k < lenb)
				b.set(k,  temp3);
			else
				b.add(k, temp3);
			
		}
		
		if (lenb > lena) {
			for (int l = lenb; l > lena; l--)
				b.remove(l-1);
		}
		
		if (lena > lenb) {
			for (int m = lena; m > lenb; m--)
				a.remove(m-1);
		}
				
	} // close switchThem ()

}
