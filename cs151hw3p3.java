
public class cs151hw3p3 {

	
	public static void main(String[] args) {
		
		double us_pop = 280000000;
		double mex_pop = 62000000;
		double t = 1;
		
		do {
			us_pop += us_pop * .02;
			mex_pop += mex_pop * .07;
			t++;
			System.out.println(t);
			System.out.println(us_pop);
			System.out.println(mex_pop);
		}
		while (mex_pop <= (us_pop * .5));
		
		System.out.println(t);
		

	}

}
