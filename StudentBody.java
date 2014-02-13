
public class StudentBody {
	
	// Creates some Address and Student objects and prints them
	
	public static void main(String[] args) {
		
		Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
		
		Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
		
		Student george = new Student ("George", "Glass", jHome, school);
		
		Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
		
		Student marsha = new Student ("Marsha", "Brady", mHome, school);
		
		Student greg = new Student ("Greg", "Brady", mHome, school);
		
		Student jan = new Student ("Jan", "Brady", mHome, school);
		
		Student cindy = new Student ("Cindy", "Brady", mHome, school);
		
		george.setTestScore(1, 80);
		george.setTestScore(2, 85);
		george.setTestScore(3, 90);
		// george.average();
		
		marsha.setTestScore(1, 90);
		marsha.setTestScore(2, 100);
		// marsha.average();
		
		greg.setTestScore(1, 45);
		greg.setTestScore(2, 30);
		greg.setTestScore(3, 51);
		
		jan.setTestScore(1, 68);
		jan.setTestScore(2, 63);
		jan.setTestScore(3, 70);
		
		cindy.setTestScore(1, 94);
		cindy.setTestScore(2, 99);
		cindy.setTestScore(3, 100);
		
		Course cs151 = new Course("Computer Science 1");
		cs151.addStudent(cindy);
		cs151.addStudent(jan);
		cs151.addStudent(greg);
		cs151.addStudent(marsha);
		cs151.addStudent(george);
		System.out.println(cs151.average());
		cs151.roll();
		
		
		// System.out.println(george);
		// System.out.println();
		// System.out.println(marsha);

	}

}
