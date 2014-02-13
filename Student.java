import java.text.DecimalFormat;

public class Student {
	
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private double test1, test2, test3;
	
	// Constructor: sets up this student with the specified values
	
	public Student (String first, String last, Address home, Address school, double test1, double test2, double test3) {
		
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	// Constructor: overloaded to set test scores to zero if not provided when Student object is created
	
	public Student (String first, String last, Address home, Address school) {
		
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	
	// Method to set test scores 
	
	public void setTestScore (int num, double newScore) {
		
		if ((num >= 1 && num <= 3) && (newScore >= 0 && newScore <= 100)) {
			
			if (num == 1)
				test1 = newScore;
			if (num == 2)
				test2 = newScore;
			if (num == 3)
				test3 = newScore;
			
		}
		
		else
			System.out.println("Invalid input.");
	} // close setTestScore()
	
	// Getter method for test scores
	
	public double getTestScore (int num) {
		
		if (num == 1)
			return test1;
		if (num == 2)
			return test2;
		if (num == 3)
			return test3;
		else {
			System.out.println("Invalid input.");
			return 0;
		}
	} // close getTestScore
	
	// Average method returns mean of test scores
	
	public double average() {
		
		DecimalFormat df = new DecimalFormat("0.##");
		Double d1;
		double total = 0;
		double n = 0;
		
		if (test1 != 0) {
			total += test1;
			n++;
		}
		if (test2 != 0) {
			total += test2;
			n++;			
		}
		if (test3 != 0) {
			total += test3;
			n++;
		}
		if (n != 0) {
			d1 = new Double(df.format(total / n));
			return d1;
		}
		else {
			System.out.println("There does not appear to be any scores to average.");
			return 0;
		}
	} // close average()
	
	// Returns a string description of this Student object
	
	public String toString() {
		
		String result;
		
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "Test one:\t" + test1 + "\n";
		result += "Test two:\t" + test2 + "\n";
		result += "Test three:\t" + test3 + "\n";
		result += "Average:\t" + average() + "\n";
		
		return result;
	}

}
