/**  Included some basic error/bounds checking and some minor format correction
 *   (i.e. removing commas a user may have included in the input).  This converter
 *   assumes terrestrial distances.  For distances on a cosmic scale, appropriate 
 *   adjustments to the bounds checking and output formatting will be necessary. The
 *   output format truncates beyond two decimal places, for more accuracy modify the
 *   decimal formatter.
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// 1 mile = 1.60935 kilometers

public class cs151hw1c {

	public static void main(String[] args) {
		
		float m_float;
		String kilo, miles;
		
		miles = JOptionPane.showInputDialog("Please enter distance in miles: ");
		miles = miles.replaceAll(",", "");
		m_float = Float.valueOf(miles);
		
		while (m_float < 0 || m_float >= 100000){
			System.out.println("Please enter distance in the range between 0 and 99,999");
			miles = JOptionPane.showInputDialog("Please enter distance in miles: ");
			miles = miles.replaceAll(",", "");
			m_float = Float.valueOf(miles);
		}
		
		kilo = m2k(m_float);
		
		JOptionPane.showMessageDialog(null, "The distance in kilometers is: " + kilo);
				
	} // close main()
	
	public static String m2k (float n){
		DecimalFormat df = new DecimalFormat("##,##0.00");
		float k = n * 1.60935F;
		return df.format(k);
				
	} // close m2k()

} // close class
