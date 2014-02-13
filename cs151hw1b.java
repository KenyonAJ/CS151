
public class cs151hw1b {
	
	public static void main(String[] args) {
		
		char a, b, c;
		a = 'A'; b = 'B'; c = 'C';
		int strL;
		
		strL = 7;
		
		f_a(strL, a, b, c);
		
		f_b(strL, a, b, c);
		
		f_c();
		
	} // close main()
	
	public static void f_a(int n, char x, char y, char z){
		
		for (int i = 0; i < n; i++){
			System.out.print(x);
			if (i == (n-1))
				System.out.print(' ');
			}
		for (int j = 0; j < n; j++){
			System.out.print(y);
			if (j == (n-1))
				System.out.print(' ');
			}
		for (int k = 0; k < n; k++){
			System.out.print(z);
			if (k == (n-1))
				System.out.println('\n');
			}	
		
	} // close f_a()
		
	public static void f_b(int n, char x, char y, char z){
		
		for (int i = 0; i < n; i++){
			System.out.print(x);
			if (i == (n-1))
				System.out.print('\n');
			}
		for (int j = 0; j < n; j++){
			System.out.print(y);
			if (j == (n-1))
				System.out.print('\n');
			}
		for (int k = 0; k < n; k++){
			System.out.print(z);
			if (k == (n-1))
				System.out.print('\n');
			}
		System.out.print("\n");
	} // close f_b()
	
	public static void f_c(){
		// I was never really all that clear on the desired output for this...
		System.out.println("=========");
		System.out.println("=AAAAAAA=");
		System.out.println("=*******=");
		System.out.println("=BBBBBBB=");
		System.out.println("=*******=");
		System.out.println("=CCCCCCC=");
		System.out.println("=========");
			
	} // close f_c()
	

} // close class
