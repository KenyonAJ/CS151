import java.text.DecimalFormat;

public class Course {
	
	private Student s1, s2, s3, s4, s5;
	private int counter; // make it a class variable
	private String name;
	
	// Constructor
	
	public Course (String name) {
		
		this.name = name;
	}
	
	// addStudent Method adds a student to the course + increments roll counter
	
	public void addStudent (Student obj) {
		
		if (counter <= 4){
			
			if (counter == 0){
				s1 = obj;
			}
			if (counter == 1){
				s2 = obj;
			}
			if (counter == 2){
				s3 = obj;
			}
			if (counter == 3){
				s4 = obj;
			}
			if (counter == 4){
				s5 = obj;
			}
			counter++;			
		}
		else
			System.out.println("The course is at capacity. Create another course object.");
	} // close addStudent()
	
	// Average: method to calculate the mean of student's mean
	
	public double average () {
		
		DecimalFormat df = new DecimalFormat("0.##");
		double total = 0;
		double n = 0;
		Double d1;
		
		if (s1.average() != 0){
			total += s1.average();
			n++;
		}
		if (s2.average() != 0){
			total += s2.average();
			n++;
		}
		if (s3.average() != 0){
			total += s3.average();
			n++;
		}
		if (s4.average() != 0){
			total += s4.average();
			n++;
		}
		if (s5.average() != 0){
			total += s5.average();
			n++;
		}
		if (n != 0){
			d1 = new Double(df.format(total / n));
			return d1;
		}
		else {
			System.out.println("There does not appear to be any average to compute.");
			return 0;
		}
	} // close average()
	
	// Roll: prints all students in the course
	
	public void roll () {
		
		if (s1 != null)
			System.out.println(s1);
		if (s2 != null)
			System.out.println(s2);
		if (s3 != null)
			System.out.println(s3);
		if (s4 != null)
			System.out.println(s4);
		if (s5 != null)
			System.out.println(s5);
	} // close roll()
	
	public String toString() {
		
		String result;
		
		result = "Course name:\t" + name + "\n";
		result += "Current roll counter:\t" + counter;
		
		return result;
	} // close toString()
	

}
