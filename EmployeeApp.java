
public class EmployeeApp {

	
	public static void main(String[] args) {
		
		Employee Andrew = new Employee();
		Andrew.setName("Andrew");
		Andrew.setDept("QuantLab");
		Andrew.setTitle("HFT Algo developer");
		Andrew.setSalary(275000);
		
		Employee Betty = new Employee();
		Betty.setName("Betty");
		Betty.setDept("Secretary Pool");
		Betty.setTitle("PA to Andrew");
		Betty.setSalary(40000.00);
		
		System.out.println("The most important employee's name " +
								" is: " + Andrew.getName() + ".");
		System.out.println("He works in the " + Andrew.getDept() +
				" as a " + Andrew.getTitle() + " and is paid $" +
				Andrew.getSalary() + " per year, not including " +
				"bonus.");
		
		System.out.println("His Personal Secretary is named: " +
				Betty.getName() + ".");
		System.out.println("She works in the " + Betty.getDept() +
				" as " + Betty.getTitle() + " and is paid $" +
				Betty.getSalary() + " per year.");

	}

}
