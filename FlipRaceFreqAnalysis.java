import java.util.Scanner;

public class FlipRaceFreqAnalysis {
	
	public static void main(String[] args) {
		
		int one = 0; int two = 0; int three = 0;
		int four = 0; int five = 0; int six = 0;
		int seven = 0; int eight = 0; int nine = 0; int ten = 0;
		int outlier = 0;
		int tempVal = 0;
		int testRuns = 0;
		Scanner keyboard = new Scanner(System.in);
		FlipRace2 fr = new FlipRace2();
		
		System.out.println("How many test runs?");
		testRuns = keyboard.nextInt();
		
		for (int i = 1; i <= testRuns; i++){
			
			tempVal = fr.flipRace();
			
			switch (tempVal){
			
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			case 7:
				seven++;
				break;
			case 8:
				eight++;
				break;
			case 9:
				nine++;
				break;
			case 10:
				ten++;
				break;
			default:
				outlier++;
				break;
			} // close switch
		} // close for loop
		
		
		// System.out.print("one: " + one + "\t");
		// System.out.print("two: " + two + "\t");
		System.out.print("three: " + three + "\t");
		System.out.print("four: " + four + "\t");
		System.out.print("five: " + five + "\t");
		System.out.print("six: " + six + "\t");
		System.out.print("seven: " + seven + "\t");
		System.out.print("eight: " + eight + "\t");
		System.out.print("nine: " + nine + "\t");
		System.out.print("ten: " + ten + "\t");
		System.out.print("outlier: " + outlier + "\n");
		
		double p_one = ((double)one/testRuns)*100;
		double p_two = ((double)two/testRuns)*100;
		double p_three = ((double)three/testRuns)*100;
		double p_four = ((double)four/testRuns)*100;
		double p_five = ((double)five/testRuns)*100;
		double p_six = ((double)six/testRuns)*100;
		double p_seven = ((double)seven/testRuns)*100;
		double p_eight = ((double)eight/testRuns)*100;
		double p_nine = ((double)nine/testRuns)*100;
		double p_ten = ((double)ten/testRuns)*100;
		double p_outlier = ((double)outlier/testRuns)*100;
		
		System.out.println("Percent 3: " + p_three);
		System.out.println("Percent 4: " + p_four);
		System.out.println("Percent 5: " + p_five);
		System.out.println("Percent 6: " + p_six);
		System.out.println("Percent 7: " + p_seven);
		System.out.println("Percent 8: " + p_eight);
		System.out.println("Percent 9: " + p_nine);
		System.out.println("Percent 10: " + p_ten);
		System.out.println("Percent Outlier: " + p_outlier);
		

	} // close main()

} // close class
