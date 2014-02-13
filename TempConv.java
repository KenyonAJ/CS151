import java.text.DecimalFormat;
// Andrew Kenyon
public class TempConv {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Fahrenheit\tCelsius");
		System.out.println("-----------------------");
		
		for (int i = 0; i <= 20; i++){
			double celc = celsius(i);
			System.out.println(i + "\t\t" + df.format(celc));
		} // close for loop

	} // close main
	
	public static double celsius(int i){
		double a = i;
		return ((5.0/9.0)*(a - 32));
		
	} // close celsius

} // close class
