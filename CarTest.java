
public class CarTest {
	
	public static void main(String[] args) {
		
		Car c1, c2, c3;
		
		c1 = new Car ("Audi", "S4", 2013);
		c2 = new Car ();
		c3 = new Car ("Nissan", "240sx", 1989);
		
		c2.setMake("Dodge");
		c2.setModel("Minivan");
		c2.setYear(2005);
		
		c1.getYear();
		

	}

}
