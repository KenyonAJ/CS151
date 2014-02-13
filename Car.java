
public class Car {
	
	String make;
	String model;
	int year;
	
	Car () {
		
		make = "default";
		model = "default";
		year = 0;
	}
	
	Car (String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	String getMake () {
		
		return make;
	}
	
	String getModel () {
		
		return model;
	}
	
	int getYear () {
		
		return year;
	}
	
	void setMake (String make) {
		
		this.make = make;
	}
	
	void setModel (String model) {
		
		this.model = model;
	}
	
	void setYear (int year) {
		
		this.year = year;
	}
	
	public String toString () {
		
		String result;
		result = "Make: " + make + "\tModel: " + model + "\tYear: " + year + "\n";
		return result;
	}

}
