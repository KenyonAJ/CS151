
public class Triangle {
	
	private int count = 0; private int j = 0;
	private float k = 0; private float l = 0;
	private double tol = .00001;
	private double[] side = new double[3];
		
	public Triangle (double a, double b, double c){
		
		side[0] = a; side[1] = b; side[2] = c;
				
		for (int i = 2; i >= 0; i--) {
			k = (float)((i+1)*Math.sin(l));
			j = Math.round(k);
			if (Math.abs(side[i] - side[j]) < tol )
				count++;
			l += 1.0;
		} // close for loop
		
	} // close constructor
	
	public boolean isRight () {
		if (Math.abs(Math.pow(side[0], 2) + Math.pow(side[1], 2)) - Math.abs(Math.pow(side[2], 2)) < tol)
			return true;
		else if (Math.abs(Math.pow(side[0], 2) + Math.pow(side[2], 2)) - Math.abs(Math.pow(side[1], 2)) < tol)
			return true;
		else if (Math.abs(Math.pow(side[1], 2) + Math.pow(side[2], 2)) - Math.abs(Math.pow(side[0], 2)) < tol)
			return true;
		else
			return false;
	} // close isRight()
	
	public boolean isScalene () {
		if (count == 0)
			return true;
		else
			return false;
	} // close isScalene()
	
	public boolean isIsosceles () {
		if (count == 1)
			return true;
		else
			return false;
	} // close isIsosceles
	
	public boolean isEquilateral () {
		if (count == 3)
			return true;
		else
			return false;
	} // close isEquilateral
	
} // close class
